# Palindrome Number

## Description

Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.

```
Example 1:

Input: 121
Output: true

Example 2:

Input: -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

Example 3:

Input: 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.


```

Could you solve it without converting the integer to a string?

## Solution

### Pseudo code:

**My Solution:**

_Step 1:_

Reverse integer and validate it with the original value.

**_Time complexity:_**  Since it is a linear search the tine complexity is **O(n)**

**_Space Complexity:_** O(1) as we are only using a single variable
