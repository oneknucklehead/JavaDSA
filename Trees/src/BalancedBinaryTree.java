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
//question link:https://leetcode.com/problems/balanced-binary-tree/
class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        return isBalanced(root.left)&&isBalanced(root.right)
                &&Math.abs(helper(root.left)-helper(root.right))<=1;
    }
    public static int helper(TreeNode node){
        if(node==null)return 0;
        int left = node.left!=null?helper(node.left):0;
        int right = node.right!=null?helper(node.right):0;
        return Math.max(left,right)+1;
    }
}