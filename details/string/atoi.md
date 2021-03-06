# String to Integer (atoi)

实现ascii码转数字

## 注意:

- 只有''被视为空格
- 数字范围为[-2^31,2^31-1 ]。如果超过这个范围先边界取值

Example 1:

```dtd
Input: "42"
Output: 42
```

Example 2:

```dtd
Input: "     -42"
Output: -42
Explanation: The first non-whitespace character is '-', which is the minus sign.
             Then take as many numerical digits as possible, which gets 42.
```

Example 3:

```dtd
Input: "4193 with words"
Output: 4193
Explanation: Conversion stops at digit '3' as the next character is not a numerical digit.
```

Example 4:

```dtd
Input: "words and 987"
Output: 0
Explanation: The first non-whitespace character is 'w', which is not a numerical 
             digit or a +/- sign. Therefore no valid conversion could be performed.
```

Example 5:

```dtd
Input: "-91283472332"
Output: -2147483648
Explanation: The number "-91283472332" is out of the range of a 32-bit signed integer.
             Thefore INT_MIN (−231) is returned.
```