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
//question link: https://leetcode.com/problems/maximum-binary-tree/
class Solution {
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return helper(nums,0,nums.length-1);
    }
    public TreeNode helper(int[] nums,int start,int end){
        if((end-start)<0){
            return null;
        }
        int max=Integer.MIN_VALUE;
        int ptr =-1;
        for(int i=start;i<=end;i++){
            if(nums[i]>max){
                max=nums[i];
                ptr=i;
            }
        }
        TreeNode root = new TreeNode();
        if(max>Integer.MIN_VALUE);
        {
            root.val=max;
            root.left=helper(nums,start,ptr-1);
            root.right = helper(nums,ptr+1,end);
        }
        return root;
    }
}