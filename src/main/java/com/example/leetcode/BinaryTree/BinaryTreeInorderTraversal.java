package com.example.leetcode.BinaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * in post Inorder traversal we visit both child nodes before reading the parent node
 * append your answer into an arraylist
 *
 */


public class BinaryTreeInorderTraversal {
        public List<Integer> solution(TreeNode root) {
            List<Integer> answer = new ArrayList();
            helper(root, answer);
            return answer;
        }

        public void helper(TreeNode root, List<Integer> answer) {
            if (root != null) {         //while the root is not equal to null
                solution(root.left);
                answer.add(root.val);
                solution(root.right);
            }
        }
}