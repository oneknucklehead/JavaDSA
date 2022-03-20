/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return checker(root.left,root.right);
    }
    public boolean checker(TreeNode l, TreeNode r){
        if(r==null&&l==null)return true;
        if(r==null||l==null)return false;
        if(r.val==l.val)
            return checker(l.left,r.right)&&checker(l.right,r.left);
        return false;
    }
}