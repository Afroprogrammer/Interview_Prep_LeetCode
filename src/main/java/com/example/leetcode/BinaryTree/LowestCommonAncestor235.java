package com.example.leetcode.BinaryTree;

/**
 * Given a binary search tree (BST), find the lowest common ancestor (LCA) of two given nodes in the BST.
 * According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p
 * and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant
 * of itself).”
 */

public class LowestCommonAncestor235 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //find the parent value

        int parentValue = root.val;
        int pValue = p.val;
        int qValue = q.val;

        // compare the values with parent values
        if( pValue > parentValue && qValue > parentValue){
            return lowestCommonAncestor(p.right, p, q);
        } else if ( pValue < parentValue && qValue < parentValue) {
            return lowestCommonAncestor(p.left, p, q);
        } else {
           return root;
        }
    }

}

/**
 * Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
 * Output: 6
 * Explanation: The LCA of nodes 2 and 8 is 6.
 */