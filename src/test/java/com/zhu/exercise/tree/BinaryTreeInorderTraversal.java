package com.zhu.exercise.tree;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    private TreeNode node;


    /**
     * 先根遍历生成树
     *
     * @param list
     * @return
     */
    public TreeNode genTree(List<Integer> list) {
        List<TreeNode> layer = new ArrayList<TreeNode>();
        Integer node = list.get(0);
        TreeNode root = new TreeNode(node);
        layer.add(root);
        // 分层生成树 i为总元素树，j为该层元素index，j除以2可以得到上一层该元素对应的根
        for (int i = 1; i <list.size() ;) {
            List<TreeNode> sublayer = new ArrayList<TreeNode>();
            Integer count = Math.min(layer.size()*2,list.size()-i);
            for (int j = 0; j <count ; j++) {
                node = list.get(i+j);
                if(node==null) continue;
                TreeNode subnode = new TreeNode(node);
                sublayer.add(subnode);
                if(j%2==0){
                    layer.get(j/2).left = subnode;
                }else{
                    layer.get(j/2).right=subnode;
                }
                layer=sublayer;
                i+=count;

            }
        }

        return root;
    }

    public List<Integer> inorderTraversal1(TreeNode root) {

        ArrayList<Integer> res = new ArrayList<Integer>();
        inorderTraversal1Helper(root, res);
        return res;
    }

    public void inorderTraversal1Helper(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        } else {
            inorderTraversal1Helper(root.left, list);
            list.add(root.val);
            inorderTraversal1Helper(root.right, list);
        }
    }

    @Test
    public void test() {
        ArrayList<Integer> input = new ArrayList<Integer>();
        input.add(1);
        input.add(null);
        input.add(2);
        input.add(3);
        TreeNode root = genTree(input);
        List<Integer> list = inorderTraversal1(root);
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
