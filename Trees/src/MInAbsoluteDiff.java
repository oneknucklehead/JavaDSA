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
//question link: https://leetcode.com/problems/minimum-absolute-difference-in-bst/
class Solution {
    public int minDiff = Integer.MAX_VALUE;
    public int prevVal = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        helper(root);
        return minDiff;
    }
    public void helper(TreeNode node){
        if(node==null)return;
        helper(node.left);
        minDiff=Math.min(minDiff,Math.abs(prevVal-node.val));
        prevVal=node.val;
        helper(node.right);
    }
}