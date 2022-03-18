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
//question link:https://leetcode.com/problems/binary-tree-level-order-traversal
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        if(root==null){
            return result;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            int level = queue.size();
            List<Integer> subArrayList = new LinkedList<>();
            for(int i=0;i<level;i++){
                TreeNode dummy = queue.remove();
                subArrayList.add(dummy.val);
                if(dummy.left!=null)
                    queue.add(dummy.left);
                if(dummy.right!=null)
                    queue.add(dummy.right);
            }
            result.add(subArrayList);
        }
        return result;
    }
}
        