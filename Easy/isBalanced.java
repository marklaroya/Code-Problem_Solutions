
// Given a binary tree, determine if it is height-balanced.
// in a nutshell, we have to determine if the binary tree is height-balanced or not.

// A height-balanced binary tree is defined as:
// a binary tree in which the left and right subtrees of every node differ in height by no more than 1.

// example:
// input:
//     3
//    / \
//   9  20
//     /  \
//    15   7

// output: true
// explanation: the left and right subtrees of the root node differ in height by no more than 1.

class Solution {
    public boolean isBalanced(TreeNode root) {
    //first we need to do is to check if the root is null, if it is then we return true.
        if (root == null) {
            return true;
        }
        
        // now we find the maximum depth of the left and right child of the tree.
        // we will use the maxDepth function to find the maximum depth of the left and right child of the tree.
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        
        // now we check if the left and right child of the tree are height-balanced.
        // we will recursively call the isBalanced function on the left and right child of the tree.
        // if the left and right child of the tree are height-balanced, we return true.
        // if the left and right child of the tree are not height-balanced, we return false.
        return Math.abs(left - right) <= 1 && isBalanced(root.left) && isBalanced(root.right);        
    }

    // this function is used to find the maximum depth of a binary tree
    public int maxDepth(TreeNode root) {
        // first we check if the root is null, if it is then we return 0.
        if (root == null) {
            return 0;
        }
        
        // now we recursively call the maxDepth function on the left and right child of the tree.
        // we find the maximum depth of the left and right child of the tree and then
        // add 1 to it because we are counting the root node as well.
        // we will use the Math.max function to find the maximum depth of the left and right child of the tree.
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}