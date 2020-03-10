# Two Sum 

## Description

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

```
** Example: **

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

```

## Solution

**Pseudo code:**

_Efficient Solution:_

Step 1: Add all the elements in the array into HashMap key and the index into hash map value. map.put(nums[i],i);

Step 2: By using a for loop or any loop see if the current element and the difference value exists in the group

Step 3: If it exists then return the current index and the Map value for the difference value key

_Time complexity:_  Since there is a single loop the time complexity **O(n)**

_Space Complexity:_ Set only stores the uniques values. As there are only 26 alphabets the size will be **O(n)**.