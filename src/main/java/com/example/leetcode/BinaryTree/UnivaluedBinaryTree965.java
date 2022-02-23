package com.example.leetcode.BinaryTree;

public class UnivaluedBinaryTree965 {
    /**A binary tree is uni-valued if every node in the tree has the same value.
     Given the root of a binary tree, return true if the given tree is uni-valued, or false otherwise.
*/
    public boolean isUnivalTree(TreeNode root){
        if(root == null) return true;
        int value = root.val;
       return   dfs(root, value);
    }

    private boolean dfs(TreeNode root, int value) {
        if (root == null) return true;
        if(root.val != value) return  false;
        return  dfs(root.right, value) && dfs(root.left, value);
    }

    public static void main(String[] args) {

//        Input: root = [1,1,1,1,1,null,1]
//        Output: true
    }
}
