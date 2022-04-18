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
//question link : https://leetcode.com/problems/kth-smallest-element-in-a-bst/
class Solution {
    Integer prev = null;
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> a = traverse(root,new ArrayList<>());

        return a.get(k-1);
    }
    public ArrayList<Integer> traverse(TreeNode root, ArrayList<Integer> a){
        if(root==null){
            return a;
        }
        traverse(root.left,a);
        a.add(root.val);
        traverse(root.right,a);
        return a;
    }

}