package com.example.leetcode.BinaryTree;

/**
 * Given the root of a binary tree, return its maximum depth.
 * A binary tree's maximum depth is
 * the number of nodes along the longest path from the root node down to the farthest leaf node.
 *
 * ----------------------------------------------------
 * find this by using depth first search recursively find the max between the dfs of the left and right node
 * if the node is null return 0; that would be the base case
 */
public class MaximumDepthOfBT104 {

    public static int solution(TreeNode root){

        if( root != null) {
            return 0;
        } else {
            int rightNode  = solution(root.left);
            int leftNode = solution(root.right);
            return Math.max(rightNode, leftNode) + 1;
        }

    }
//    Input: root = [3,9,20,null,null,15,7]
//    Output: 3
}
