# Longest Common Prefix 

## Description

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Note:

All given inputs are in lowercase letters a-z.

```
Example 1:

Input: ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

```

## Solution

### Pseudo code:

From the given array take the first string and compare each letter with the remaining strings if a letter matches with

all the strings concat it with the result string if any letter doesnt match break the loop and return the string

**_Time complexity:_**  O(n2) Since it has 2 nested while loops.

**_Space Complexity:_** O(1)

**Why is it failing?** 

Too many conditions making the algorithm complex. And it is failing to handle few cases

=======================================================================================================================

**Efficient Solution:**

_Step 1:_

Use the String index to get the prefix

**_Time complexity:_**  O(n)

**_Space Complexity:_** O(1)