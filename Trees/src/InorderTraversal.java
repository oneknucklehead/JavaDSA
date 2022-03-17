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
//question link : https://leetcode.com/problems/binary-tree-inorder-traversal/
class Solution {
    //Iterative solution
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        while(curr!=null||!st.isEmpty()){
            while(curr!=null){
                st.push(curr);
                curr=curr.left;
            }
            curr=st.pop();
            ans.add(curr.val);
            curr=curr.right;
        }
        return ans;
    }
}

//recursive solution
// ArrayList<Integer> list = new ArrayList<Integer>();
// if(root==null){
//     return list;
// }
// list.addAll(inorderTraversal(root.left));
// list.add(root.val);
// list.addAll(inorderTraversal(root.right));
// return list;
        