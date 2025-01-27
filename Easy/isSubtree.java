
// this problem is to check if the given tree is a subtree of the other tree or not
// the isSubtree function will take two parameters, the root and the subRoot
// the function will return true if the subRoot is a subtree of the root, otherwise it will return false


class Solution {  
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {

        // if the subRoot is null, then we return true
        if(subRoot == null) return true;
        // if the root is null, then we return false
        if(root == null) return false;

        // if the root and the subRoot are the same, then we return true
        if(isSameTree(root, subRoot)) return true;

        // then we recursively call the isSubtree function on the left and right child of the root
        // we will return true if the subRoot is a subtree of the left or right child of the root
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
        
    }

    // this function is used to check if the two binary trees are the same or not
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // if the two binary trees are the same, we will return true.
        // which the p and q are null then we return true
        if(p == null && q == null) return true;

        // if the two binary trees are not the same, we will return false.
        if(p == null || q == null) return false;

        // if the two binary trees are not the same, we will return false.
        if(p.val != q.val) return false;

        // we will recursively call the isSameTree function on the left and right child
        // in a nutshell, we have to determine if the two binary trees are the same or not.
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}