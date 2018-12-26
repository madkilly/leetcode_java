# 题目

Given a 32-bit signed integer, reverse digits of an integer.

Example 1:

	Input: 123
	Output: 321
	Example 2:

	Input: -123
	Output: -321
	Example 3:

	Input: 120
	Output: 21
Note:
Assume we are dealing with an environment which could only store integers within the 32-bit signed integer range: [−231,  231 − 1]. For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

拿到题目第一个解决方案:就是队列 先进先出

# 总结

## 数据溢出问题

	Integer.MIN_VALUE = -2147483648
	Integer.MAX_VALUE = 2147483647
	Long.MIN_VALUE = -9223372036854775808
	Long.MAX_VALUE = 9223372036854775807
	Float.MIN_VALUE = 1.4E-45
	Float.MIN_NORMAL = 1.17549435E-38
	Float.MAX_VALUE = 3.4028235E38
	Double.MAX_VALUE = 1.7976931348623157E308
	Double.MIN_VALUE = 4.9E-324

java int最大最小值 是有上限的 这个问题一开始没有考虑到，其实题目也有提到溢出返回0.这块是自己粗心了

## 效率问题
	
我一开始采用了队列处理，走了两个循环效率比较低，其实可以采用单循环一次算出结果的