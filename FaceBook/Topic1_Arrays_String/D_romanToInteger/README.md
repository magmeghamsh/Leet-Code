## Description
Given a Roman Number, convert into Integer.

```
Example 1:

Input: "III"
Output: 3

Example 2:

Input: "IV"
Output: 4

Example 3:

Input: "IX"
Output: 9

Example 4:

Input: "LVIII"
Output: 58
Explanation: L = 50, V= 5, III = 3.

Example5 : 

Input: "MCMXCIV"
Output: 1994
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.
```

## Solution
**Efficient Solution:**

1. Iterate over the length of ROMAN characters.
2. Intialize two pointers left and right to trac the calue of two subsequent characters.
3. Intialize a result variable to add the total value for each iteration.
4. If the left value is less than right then subtract(right value - left value) and add it to result.
5. If left value is greater than the right value add the left value to result.
6. Stop the addition when the left and right value is reached to end of length.
**_Time complexity:_** 

since we are having a loop , the time complexity will be O(n)

**_Space Complexity:_** 
O(1)  : we are recreating the set in every  outer iteration.

=======================================================================================================================
## Rules

1. Complete Daily 2 Problems (Medium)
2. Spend 15 mins to get the Pseudo Code
3. Try to understand the effiecient solution approach if your solution doesnt work
