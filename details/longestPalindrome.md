# longestPalindrome

## 问题

Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

找到字符串中最大的子回文，字符串最长为1000

Example 1:

```
	Input: "babad"
	Output: "bab"
	Note: "aba" is also a valid answer.
```

Example 2:

```
	Input: "cbbd"
	Output: "bb"
```

## 解法1

思路比较简单，两层循环，先循环字符串每个字符，在从这个字符出发搜索左右字符是否相等，这一步有两种情况

奇数回文型：
	例子：aba
	
偶数回文型
	例子：abba
	
针对两种情况分别搜索，并记录maxlen 遍历完成后记下最长的串就行了

本方法复杂度较高哦o(log n*n) ,另一种Manacher算法最长回文都线性算法 抽时间补上