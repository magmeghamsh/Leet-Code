# Longest sub string non repeating characters

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

### Pseudo code:

**My Solution:**

_Step 1:_

_Step 2:_

_Time complexity:_  

_Space Complexity:_ 

**Why is it failing?**

=======================================================================================================================

**Efficient Solution:**

Using sliding window technique loop over the string

_Step 1:_ Initiate leftPointer and rightPointer (as index). Add the values in the set.  

_Step 2:_ If set does not contain the value add the value to the set and then increment the right pointer

_Step 3:_ If set has the value remove the character which is at leftPointer and then increment the value.

_Step 4:_ Through out the process add the set length to a max variable (int) E.g int max = Math.max(set.size(), max); 

_Time complexity:_  Since there is a single loop the time complexity **O(n)**

_Space Complexity:_ Set only stores the uniques values. As there are only 26 alphabets the size will be **O(1)**.