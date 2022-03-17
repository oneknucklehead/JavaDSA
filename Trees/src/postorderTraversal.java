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
//question link : https://leetcode.com/problems/binary-tree-postorder-traversal
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {

//Iterative solution
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if(root==null){
            return list;
        }
        st.push(root);
        while(!st.isEmpty()){
            TreeNode curr = st.pop();
            if(curr.right==null&&curr.left==null){
                list.add(curr.val);
            }
            else{
                st.push(curr);
                if(curr.right!=null){
                    st.push(curr.right);
                }
                if(curr.left!=null){
                    st.push(curr.left);
                }
                curr.right=null;
                curr.left=null;

            }
        }
        return list;
    }
}

//recursive solution
//        ArrayList<Integer> list = new ArrayList<>();
//        if(root==null){
//            return list;
//        }
//        list.addAll(postorderTraversal(root.left));
//        list.addAll(postorderTraversal(root.right));
//        list.add(root.val);
//        return list;