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
class BSTIterator {
    //O(h space complexity)
    Stack<TreeNode> stack;
    public BSTIterator(TreeNode root) {
        stack = new Stack<>();
        TreeNode node = root;
        updateStack(node);
    }
    public int next() {
        TreeNode toRemove = stack.pop();
        updateStack(toRemove.right);
        return toRemove.val;
    }
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    public void updateStack(TreeNode node){
        while(node != null){
            stack.add(node);
            node = node.left;
        }
    }
}


//BRUTE FORCE
//     TreeNode root;
//     int pointer;
//     ArrayList<Integer> a;
//     public BSTIterator(TreeNode root) {
//         this.root = root;
//         this.pointer = 0;
//         this.a= new ArrayList<>();
//         sortList(root,a);
//     }

//     public int next() {
//         return a.get(pointer++);
//     }

//     public boolean hasNext() {
//         return pointer+1<=a.size();
//     }
//     private void sortList(TreeNode node, ArrayList<Integer> a){
//         if(node==null){
//             return;
//         }
//         sortList(node.left,a);
//         a.add(node.val);
//         sortList(node.right,a);
//     }


/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */