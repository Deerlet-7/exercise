package day17;

/**
 * Created by Deerlet-7 on 2020/4/17 21:25
 * 镜像二叉树
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}
class BinTree {
    private TreeNode root = null;
    public BinTree(){
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(5);
        TreeNode n6 = new TreeNode(6);
        root = n1;
        n1.left = n2;
        n1.right = n4;
        n2.left = n3;
        n4.left = n5;
        n4.right = n6;
    }
    public void Mirror(){
        Mirror(root);
    }
    private void Mirror(TreeNode root) {
        TreeNode tmp = null;
        if(root != null){
            tmp = root.left;
            root.left = root.right;
            root.right = tmp;
        }
        if(root.left != null){
            Mirror(root.left);
        }
        if(root.right != null){
            Mirror(root.right);
        }
    }
    public void preOrder(){//避免用户调用时还要传参，进程包装一层
        System.out.print("前序遍历：");
        preOrder(root);
        System.out.println();
    }
    private void preOrder(TreeNode root){
        if(root != null){
            System.out.print(root.val + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }
}
public class Solution {
    public static void main(String[] args) {
        BinTree binTree = new BinTree();
        binTree.preOrder();
        binTree.Mirror();
        binTree.preOrder();
    }

}
