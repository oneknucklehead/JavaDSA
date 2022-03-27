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
//question link: https://leetcode.com/problems/binary-tree-paths/
class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> ans = new ArrayList<>();
        if(root==null)return ans;
        String curr = Integer.toString(root.val);
        if(root.left==null&&root.right==null){
            ans.add(curr);
            return ans;
        }
        if(root.left!=null){
            helperDFS(root.left,curr,ans);
        }
        if(root.right!=null){
            helperDFS(root.right,curr,ans);
        }
        return ans;
    }
    public static void helperDFS(TreeNode node, String curr,List<String> ans){
        curr+="->"+node.val;
        if(node.left==null&&node.right==null){
            ans.add(curr);
            return;
        }
        if(node.left!=null){
            helperDFS(node.left,curr,ans);
        }
        if(node.right!=null){
            helperDFS(node.right,curr,ans);
        }

    }
}