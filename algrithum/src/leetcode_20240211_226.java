package src;

public class leetcode_20240211_226 {
    public static TreeNode invertTree(TreeNode root) {
        if(root==null)  return null;
        TreeNode treeNode=root.right;
        root.right=root.left;
        root.left=treeNode;
        invertTree( root.right );
        invertTree( root.left );
        return root;
    }
}
