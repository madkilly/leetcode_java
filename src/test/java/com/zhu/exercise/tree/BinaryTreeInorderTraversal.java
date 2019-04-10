package com.zhu.exercise.tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {

 public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

private TreeNode node;

    public  TreeNode genTree(List<Integer> list){
        TreeNode result=null;
        for(int i = 0;i<list.size();i=i+3){
            TreeNode root= new TreeNode(list.get(i));
            root.left = new TreeNode(list.get(i + 1));
            root.right = new TreeNode(list.get(i + 2));
            if(i==0){
                result=root;
            }
        }
        return result;
    }

    public List<Integer> inorderTraversal1(TreeNode root) {

        ArrayList<Integer> res = new ArrayList<Integer>();
        inorderTraversal1Helper(root,res);
        return res;
    }

    public void inorderTraversal1Helper(TreeNode root,List<Integer> list){
        if(root==null){
            return;
        }else{
            inorderTraversal1Helper(root.left,list);
            list.add(root.val);
            inorderTraversal1Helper(root.right,list);
        }
    }

    @Test
    public void test(){
        ArrayList<Integer> input = new ArrayList<Integer>();
        input.add(1);
        input.add(null);
        input.add(2);
        input.add(3);
        genTree(input);
    }
}
