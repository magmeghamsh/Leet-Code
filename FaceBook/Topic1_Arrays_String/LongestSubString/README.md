## Description
Given a string, find the length of the longest substring without repeating characters.

```
Example 1:

Input: "abcabcbb"
Output: 3 
Explanation: The answer is "abc", with the length of 3. 
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3. 


Note that the answer must be a substring, "pwke" is a subsequence and not a substring.


```

## Solution
**My Solution:**

1. Iterate over the length of String, starting from i=0; 
2. Create a sub loop and iterate over the length of a String, starting j=i+1;
3. If the value doesnt exist in a Dictionary/Data Structure (Set) then add it to set
4. Else set the max value: MAX(max_value, length of the set)
5. Make the set to empty as the last step in the second loop.

**_Time complexity:_** 

since we are having loop with in a loop, the time complexity will be O(n2)

**_Space Complexity:_** 
O(n)  : we are recreating the set in every  outer iteration.

**Why is it failing?**
time complexity is O(n2). 

=======================================================================================================================

**Efficient Solution:**

1. 

**_Time complexity:_**  

**_Space Complexity:_** 

=======================================================================================================================
## Rules

1. Complete Daily 2 Problems (Medium)
2. Spend 15 mins to get the Pseudo Code
3. Try to understand the effiecient solution approach if your solution doesnt work
