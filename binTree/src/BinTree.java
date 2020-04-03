//二叉树孩子表示法
class BTNode{
    BTNode left = null; //左孩子
    BTNode right =null;//右孩子
    int val;
    public BTNode(int val){
        this.val = val;
    }
}
public class BinTree {
    private BTNode root = null;//引用二叉树根节点
    //先快速创建一颗二叉树
    public BinTree(){
        BTNode n1 = new BTNode(1);
        BTNode n2 = new BTNode(2);
        BTNode n3 = new BTNode(3);
        BTNode n4 = new BTNode(4);
        BTNode n5 = new BTNode(5);
        BTNode n6 = new BTNode(6);
        root = n1;
        n1.left = n2;
        n1.right = n4;
        n2.left = n3;
        n4.left = n5;
        n4.right = n6;
    }
    public void preOrder(){//避免用户调用时还要传参，进程包装一层
        System.out.print("前序遍历：");
        preOrder(root);
        System.out.println();
    }
    public void inOrder(){
        System.out.print("中序遍历：");
        inOrder(root);
        System.out.println();
    }
    public void postOrder(){
        System.out.print("后序遍历：");
        postOrder(root);
        System.out.println();
    }
    public int getNodeCount(){
        return getNodeCount(root);
    }
    public int getLeafNodeCount(){
        return getLeafNodeCount(root);
    }
    public int getKLeveNodeCount(int k){
        return getKLeveNodeCount(root,k);
    }
    //前序遍历
    private void preOrder(BTNode root){
        if(root != null){
            System.out.print(root.val + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    //中序遍历
    private void inOrder(BTNode root){
        if(null != root){
            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }
    }
    //后序遍历
    private void postOrder(BTNode root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.val + " ");
        }
    }
    //获取节点个数
    private int getNodeCount(BTNode root){
        if(root == null){
            return 0;
        }
        return 1+getNodeCount(root.left)+getNodeCount(root.right);
    }
    //获取叶子节点的个数
    private int getLeafNodeCount(BTNode root){
        if(null == root){
            return 0;
        }
        if((root.left==null)&&(root.right==null)){
            return 1;
        }
        return getLeafNodeCount(root.left)+getLeafNodeCount(root.right);
    }
    //获取第k层节点个数
    private int getKLeveNodeCount(BTNode root,int k){
        if(root==null||k<1){
            return 0;
        }
        if(1==k){
            return 1;
        }
        return getKLeveNodeCount(root.left,k-1)+getKLeveNodeCount(root.right,k-1);
    }

    public static void main(String[] args) {
        BinTree bt = new BinTree();
        bt.preOrder();
        bt.inOrder();
        bt.postOrder();
        System.out.println(bt.getNodeCount());
        System.out.println(bt.getLeafNodeCount());
        System.out.println(bt.getKLeveNodeCount(2));
    }
}