package com.example.leetcode.BinaryTree;

import java.util.ArrayList;
import java.util.List;

/**
 * in post order traversal we visit both child nodes before reading the parent node
 * append your answer into an arraylist
 *
 */

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
     }
 }

public class BinaryPostOrderTraversal {
    public List<Integer>  solution(TreeNode root){
        List<Integer> answer = new ArrayList();
        helper(root, answer);
        return answer;
    }


    public void helper(TreeNode root,  List<Integer> answer){
        if(root != null){         //while the root is not equal to null
            solution(root.left);
            solution(root.right);
            answer.add(root.val);
        }
    }
}
