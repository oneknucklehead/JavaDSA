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
    // Morris traversal Best solution TC: O(N) SC: O(1)
//    ArrayList<Integer> list = new ArrayList<>();
//    TreeNode curr = root;
//        while(curr!=null){
//                if(curr.left==null){
//                list.add(curr.val);
//                curr=curr.right;
//                }
//                else{
//                TreeNode pre = curr.left;
//                while((pre.right!=null)&&(pre.right!=curr)){
//                pre=pre.right;
//                }
//                if(pre.right==null){
//                pre.right=curr;
//                curr=curr.left;
//                }
//                else{
//                pre.right=null;
//                list.add(curr.val);
//                curr=curr.right;
//                }
//                }
//                }
//                return list;

//recursive solution
// ArrayList<Integer> list = new ArrayList<Integer>();
// if(root==null){
//     return list;
// }
// list.addAll(inorderTraversal(root.left));
// list.add(root.val);
// list.addAll(inorderTraversal(root.right));
// return list;
        