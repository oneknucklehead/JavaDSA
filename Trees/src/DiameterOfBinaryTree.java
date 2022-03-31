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
//question link: https://leetcode.com/problems/diameter-of-binary-tree/
class Solution {
    public int sum;
    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return sum;
    }
    public int helper(TreeNode node){
        if(node==null)return 0;
        int lh=helper(node.left);
        int rh=helper(node.right);
        sum=Math.max(sum,lh+rh);
        return 1+Math.max(lh,rh);
    }