// we need to check if the two binary trees are the same or not.
// in a nutshell, we have to determine if the two binary trees are the same or not.
//example:
// input: 
// p = [1,2,3], q = [1,2,3]
// output: true
// explanation: the two binary trees are the same.

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // we will iterate through the two binary trees and check if the two binary
        // trees are the same or not.
        for (int i = 0; i < 100; i++) {
            // if the two binary trees are the same, we will return true.
            if (p == null && q == null) {
                return true;
            }
            // if the two binary trees are not the same, we will return false.
            if (p == null || q == null) {
                return false;
            }
            // if the two binary trees are not the same, we will return false.
            if (p.val != q.val) {
                return false;
            }
            // we will recursively call the isSameTree function on the left and right child
            // of the two binary trees.
            p = p.left;
            q = q.left;
        }

        return true;
    }
}

// the other solution is to use recursion
// this solution uses recursion to check if the two binary trees are the same or
// not.

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // if the two binary trees are the same, we will return true.
        if (p == null && q == null) {
            return true;
        }
        // if the two binary trees are not the same, we will return false.
        if (p == null || q == null) {
            return false;
        }
        // if the two binary trees are not the same, we will return false.
        if (p.val != q.val) {
            return false;
        }
        // we will recursively call the isSameTree function on the left and right child
        // of the two binary trees.
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
