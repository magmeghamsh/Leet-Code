# Longest substring palindrome


## Description

Given a string s, find the longest palindromic substring in s. You may assume that the maximum length of s is 1000.

```
Example 1:

Input: "babad"
Output: "bab"
Note: "aba" is also a valid answer.
Example 2:

Input: "cbbd"

```

## Solution

### Pseudo code:

**My Solution:**
c a b b a c e 

Start with the string itself and performing the palindrome check for every possible substring in decrements of length

c a b b a c e | c a b b a c | c a b b a | c a b b
              | a b b a c e | a b b a c | a b b a
                            | b b a c e | b b a c
                                        | b a c e

**_Time complexity:_**  

For a string of 7 characters
We end up with  16 combinations
and for 1000 characters we end up with 2200 combinations -> O(2n) which is  O(n)

**_Space Complexity:_** 

**Why is it failing?**


The time complexity is o(n2) for creating the substring and the o(n) for checking it is a palindrome. So the total complexity is O(n3).

======================================================================================

**Efficient Solution:**

_Step 1:_

_Step 2:_

**_Time complexity:_**  

**_Space Complexity:_** 
