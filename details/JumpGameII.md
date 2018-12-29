# JumpGameII

## 问题

Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Your goal is to reach the last index in the minimum number of jumps.

Example:
```
Input: [2,3,1,1,4]
Output: 2
Explanation: The minimum number of jumps to reach the last index is 2.
    Jump 1 step from index 0 to 1, then 3 steps to the last index.
```
**Note:**

You can assume that you can always reach the last index.

给一串非零数组，第一个代表起始位置（？）最后一个代表目标位置 其他位置的数字代表每个位置能够跳的最大距离
求到达目标的最小距离

看了答案 第一个代表起始位置（？）第一个数组貌似并没有特殊意义  目标位置则由数组大小代表

## 题目分析
 我觉得他的Explanation是错的，初始位置是 2 最高能跳1到3 3再跳1到4 而不是他说的什么0到4
 
思路很简单两种算法 贪心或动态规划

## 解法1 贪心算法
贪心算法 

## 解法2 动态规划