# Rotate Image 矩阵旋转

## 问题
nxn矩阵旋转90度

## 示例

```
Given input matrix = 
[
  [1,2,3],
  [4,5,6],
  [7,8,9]
],

rotate the input matrix in-place such that it becomes:
[
  [7,4,1],
  [8,5,2],
  [9,6,3]
]
```

```
Given input matrix =
[
  [ 5, 1, 9,11],
  [ 2, 4, 8,10],
  [13, 3, 6, 7],
  [15,14,12,16]
], 

rotate the input matrix in-place such that it becomes:
[
  [15,13, 2, 5],
  [14, 3, 4, 1],
  [12, 6, 8, 9],
  [16, 7,10,11]
]
```

## 解法1

第一种解法十分简单

```
x00	x01	x02
x10 x11 x12
x20 x21 x22

转化为
x20 x10 x00
x21 x11 x01
x22 x12 x02

```
y为转置后的矩阵
x为原始矩阵
通过矩阵的转化可以得出  

y的行为x的列
y的列号为x的n-1-行号

搭配辅助空间可以轻易得出结果


## 解法2

通过对角线翻转 这种方法不需要使用辅助空间能够提高效率