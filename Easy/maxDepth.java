
// this problem is to find the maximum depth of a binary tree
// we can do this by recursively calling the maxDepth function on the left and right child of the tree.
// in a nutshell, it's finding the maximum depth of the left and right child of the tree and then adding 1 to it.
// here's the formula: maxDepth(root) = max(maxDepth(root.left), maxDepth(root.right)) + 1

// example:
// input:
//    4
//   / \
//  2   7
// / \ / \
// 1  3 6  9

// output: 3

class Solution {
    public int maxDepth(TreeNode root) {
        // first we check if the root is null, if it is then we return 0.
        if (root == null)
            return 0;

        // now we recursively call the maxDepth function on the left and right child of
        // the tree.
        // we find the maximum depth of the left and right child of the tree and then
        // add 1 to it.
        // we will use the Math.max function to find the maximum depth of the left and
        // right child of the tree.
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;

    }

}