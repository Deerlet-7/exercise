import java.util.*;

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
    public int getHight(){
        return getHight(root);
    }
    public BTNode find(int val){
        return find(root,val);
    }
    //前序遍历
    private void preOrder(BTNode root){
        if(root != null){
            System.out.print(root.val + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
    //非递归前序遍历 层序遍历用栈实现
    public void preOrderNor1(){
        if(null == root){
            return;
        }
        Stack<BTNode> s = new Stack<>();
        s.push(root);
        while (!s.isEmpty()){
            BTNode cur = s.peek();
            s.pop();
            System.out.print(cur.val+" ");
            if(null != cur.right){
                s.push(cur.right);
            }
            if(null != cur.left){
                s.push(cur.left);
            }
        }
        System.out.println();
    }
    //非递归前序遍历用栈实现
    public void preOrderNor2(){
        if(null == root){
            return;
        }
        Stack<BTNode> s = new Stack<>();
        s.push(root);
        while (!s.isEmpty()){
            BTNode cur = s.peek();
            s.pop();
            while (null != cur){
                System.out.print(cur.val+" ");
                if(cur.right != null){
                    s.push(cur.right);
                }
                cur = cur.left;
            }
        }
        System.out.println();
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
    //求二叉树高度
    private int getHight(BTNode root){
        if(null == root){
            return 0;
        }
        int leftHight =  getHight(root.left);
        int rightHight = getHight(root.right);
        return Math.max(leftHight+1,rightHight+1);
    }
    //获取val在树中对应的节点，找到返回节点，没找到返回null
    private BTNode find(BTNode root,int val){
        if(null == root){
            return null;
        }
        if(root.val == val){
            return root;
        }
        BTNode retNode = null;
        if(null != (retNode = find(root.left,val))||null != (retNode = find(root.right,val)))
            return retNode;
        return null;
    }
    //检查两棵树是否相同
    public boolean isSameTree(BTNode p,BTNode q){
        if(null == p&&null == q){
            return true;
        }
        if(null == p||null == q){
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
    //判断一棵树t是另一颗s的子树
    public boolean isSubtree(BTNode s,BTNode t){
        if(null == s && null == t){
            return false;
        }
        if(null == s){
            return false;
        }
        if(null == t){
            return true;
        }
        if(s.val == t.val && isSameTree(s,t)){
            return true;
        }
        return isSubtree(s.left,t)||isSubtree(s.right,t);
    }
    //判断是否平衡二叉树
    public boolean isBalanced(BTNode root){
        if(null == root){
            return true;
        }
        int leftHight = getHight(root.left);
        int rightHight = getHight(root.right);
        if(Math.abs(leftHight-rightHight)>1){
            return false;
        }
        return isBalanced(root.left) && isBalanced(root.right);
    }
    //层序遍历（广度优先遍历 队列）
    public void LeverOrder(){
        if(null == root){
            return;
        }
        Queue<BTNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            BTNode cur = q.poll();
            System.out.print(cur.val+" ");
            if(null != cur.left){
                q.offer(cur.left);
            }
            if(null != cur.right){
                q.offer(cur.right);
            }
        }
        System.out.println();
    }
    //判断是否为完全二叉树
    public boolean isCompleteTree(){
        if(null == root){
            return true;
        }
        //层序遍历找不饱和节点
        Queue<BTNode> q = new LinkedList<>();
        q.offer(root);
        boolean isLeafOrLeft = false;
        while (!q.isEmpty()){
            BTNode cur = q.poll();
            if(isLeafOrLeft){
                //2、第一个不饱和结点之后，所有节点不能有孩子
                if(cur.left != null || null != cur.right){
                    return false;
                }
            }else {
                    //1、按照层序遍历找第一个不饱和节点
                    //左右孩子均存在
                    if(null != cur.left && null != cur.right){
                        q.offer(cur.left);
                        q.offer(cur.right);
                    }else if(cur.left != null){
                        //只有左孩子
                        q.offer(cur.left);
                        isLeafOrLeft = true;
                    }else if(cur.right != null){
                        return false;
                    }else {
                        //叶子
                        isLeafOrLeft = true;
                    }
            }
        }
        return true;
    }
    //二叉树的层序遍历
    public List<List<Integer>> levelOrder(BTNode root) {
        List<List<Integer>> ret = new ArrayList<>();
        if(null == root){
            return ret;
        }
        Queue<BTNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()){
            int size = q.size();
            List<Integer> level = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                BTNode cur = q.poll();
                level.add(cur.val);
                if(null != cur.left){
                    q.offer(cur.left);
                }
                if(null != cur.right){
                    q.offer(cur.right);
                }
            }
            ret.add(level);
        }
        return ret;
    }

    public static void main(String[] args) {
        BinTree bt = new BinTree();
        bt.preOrder();
        if(bt.isCompleteTree()){
            System.out.println("is Com");
        }else {
            System.out.println("isn't Com");
        }
    }
}
