package com.example.leetcode.BinaryTree;
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
 * }  check the base case if the root values of both nodes are not the same return the appropriate answer
 * check the node values and return the appropriate boolean values.
 * */


public class SameTree100 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return  true;

        if( p == null || q == null) return  false;

        if (p.val != q.val) return false;

        return  isSameTree( p.left , p.right) && isSameTree(p.right, q.right);
    }

//    Input: p = [1,2,3], q = [1,2,3]
//    Output: true
}
