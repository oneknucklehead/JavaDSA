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
//question link: https://leetcode.com/problems/construct-string-from-binary-tree/
class Solution {
    public String tree2str(TreeNode root) {
        StringBuilder curr = new StringBuilder();
        preorder(root,curr);
        return curr.toString();
    }
    public void preorder(TreeNode node,StringBuilder curr){
        curr.append(node.val);
        if(node.left==null&&node.right==null){
            return;
        }
        curr.append("(");
        if(node.left!=null){
            preorder(node.left,curr);
        }
        curr.append(")");
        if(node.right!=null){
            curr.append("(");
            preorder(node.right,curr);
            curr.append(")");
        }
    }
}