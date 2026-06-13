package com.mohancode.cart.Interviewprep;

import lombok.val;

import java.util.LinkedList;

public class PathSum {
    public static void main(String[] args) {
/*
        5
                / \
        4   8
                /   / \
        11  13  4
                /  \      \
        7    2      1*/
        TreeNode root = new TreeNode(5);

        // Create left subtree
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);

        // Create right subtree
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

       int B=22;

        System.out.println(new Solution().hasPathSum(root,B));



        
    }
}

  class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) {
       val = x;
       left=null;
       right=null;
      }
  }
 class Solution {
    public int hasPathSum(TreeNode A, int B) {
        return check(A,B)?1:0;
    }


    boolean check(TreeNode a, int b) {
        if(a==null) return false;
        if(a.val==b && a.left==null && a.right==null) return true;
        System.out.println(a.val);
        return check(a.left,b-a.val) || check(a.right,b-a.val);
    }
}
