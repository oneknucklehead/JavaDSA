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
//question link: https://leetcode.com/problems/range-sum-of-bst/
class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root == null) return 0;

        if(root.val < low) { // discard the left sub-tree
            return rangeSumBST(root.right, low, high);
        }

        if(root.val > high) { //  discard the right sub-tree
            return rangeSumBST(root.left, low, high);
        }

        return rangeSumBST(root.left, low, high) + root.val + rangeSumBST(root.right, low, high);
    }

}


//Brute force
// public int rangeSumBST(TreeNode root, int low, int high) {
//     sumup(root,low,high);
//     return sum;
// }
// public void sumup(TreeNode node, int low, int high){
//     if(node==null){
//         return;
//     }
//     if(node.val>=low&&node.val<=high){
//         sum+=node.val;
//     }
//     sumup(node.left,low,high);
//     sumup(node.right,low,high);
// }