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
//question link: https://leetcode.com/problems/binary-tree-preorder-traversal/
class Solution {

    public List<Integer> preorderTraversal(TreeNode root) {
        //iterative solution
        ArrayList<Integer> list = new ArrayList<>();
        Stack<TreeNode> st = new Stack<>();
        if(root==null){
            return list;
        }
        st.push(root);
        while(!st.isEmpty()){
            TempNode node = st.pop();
            list.add(node.val);
            if(node.right!=null){
                st.push(node.right);
            }
            if(node.left!=null){
                st.push(node.left);
            }
        }
        return list;
    }
}

//Recursive solution
// ArrayList<Integer> list = new ArrayList<>();
//         if(root == null){
//             return list;
//         }
//         list.add(root.val);
//         list.addAll(preorderTraversal(root.left));
//         list.addAll(preorderTraversal(root.right));
//         return list;