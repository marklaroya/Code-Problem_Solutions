
// Given a binary tree, you need to compute the length of the diameter of the tree. The diameter of a binary tree is the length of the longest path between any two nodes in a tree. This path may or may not pass through the root.
// in a nutshell, we have to find the longest path between any two nodes in the tree.

// Example 1:
// Input: root = [1,2,3,4,5]
// Output: 3
// Explanation: 3 is the length of the path [4,2,1,3] or [5,2,1,3].

class Solution {
    public int diameterOfBinaryTree(TreeNode root) {
        // first we check if the root is null, if it is then we return 0.
        if (root == null)
            return 0;

        // now we find the maximum depth of the left and right child of the tree.
        // we will use the maxDepth function to find the maximum depth of the left and right child of the tree.
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        // now we find the diameter of the left and right child of the tree.
        // we will recursively call the diameterOfBinaryTree function on the left and right child of the tree.
        int leftDiameter = diameterOfBinaryTree(root.left);
        int rightDiameter = diameterOfBinaryTree(root.right);

        // finally we return the maximum of the diameter of the left and right child of the tree.
        return Math.max(left + right, Math.max(leftDiameter, rightDiameter));
    }

    // this function is used to find the maximum depth of a binary tree

    public int maxDepth(TreeNode root) {
        // first we check if the root is null, if it is then we return 0.
        if (root == null)
            return 0;

        // now we recursively call the maxDepth function on the left and right child of the tree.
        // we find the maximum depth of the left and right child of the tree and then
        // add 1 to it because we are counting the root node as well.
        // we will use the Math.max function to find the maximum depth of the left and
        // right child of the tree.
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;

    }
}