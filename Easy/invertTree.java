
// this problem is a reverse of the mirror tree problem. In this problem we have to invert the tree.
// we can do this by swapping the left and right child of the tree. We can do this recursively.
// in a nutshell, we can swap the left and right child of the tree and then recursively call the invertTree function on the left and right child of the tree.

//example: 
// input:
//     4
//    / \
//   2   7
//  / \ / \
// 1  3 6  9

// output:
//     4
//    / \
//   7   2
//  / \ / \
// 9  6 3  1

// the above example shows the tree before and after inverting the tree.

// the time complexity of this solution is O(n) where n is the number of nodes in the tree.
// the space complexity of this solution is O(n) where n is the number of nodes in the tree.

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null)
            return null;

        // now we make a temp variable to store the left child of the root node.
        // we use object type because the left and right child of the root node are of
        // type TreeNode.
        Object temp = root.left;
        // now we swap the left and right child of the root node.
        root.left = root.right;

        // and then the root.right is assigned the value of the temp variable.
        // in a nutshell, the left and right child of the root node are swapped.
        root.right = (TreeNode) temp;

        // now we recursively call the invertTree function on the left and right child
        // of the root node.
        invertTree(root.left);
        invertTree(root.right);

        // finally we return the root node.
        return root;
    }

}