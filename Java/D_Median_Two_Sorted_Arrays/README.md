# 


## Description

There are two sorted arrays nums1 and nums2 of size m and n respectively.

Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).

You may assume nums1 and nums2 cannot be both empty.

```
Example 1:

nums1 = [1, 3]
nums2 = [2]

The median is 2.0
Example 2:

nums1 = [1, 2]
nums2 = [3, 4]

The median is (2 + 3)/2 = 2.5

```

## Solution

### Pseudo code:

**My Solution:**

_Step 1:_ Create a new array by adding the elemnts of the 2 array.

_Step 2:_ Sort the elements in the array using Arrays.sort()

_Step 3:_ If the length of the array is even then return the average of middle two elements. Else return the middle element Index of (arr.length-1)/2

**_Time complexity:_**  Since Arrays.sort() uses quick sort, O(n^2) for the worst case.

**_Space Complexity:_** O(1)

**Why is it failing?**

Eventhough it does the job,the Algortihm is not efficient in terms of time complexity
=======================================================================================================================

**Efficient Solution:**

_Step 1:_

_Step 2:_

**_Time complexity:_**  

**_Space Complexity:_** 

**Additional Reference:**
https://www.youtube.com/watch?time_continue=2&v=LPFhl65R7ww&feature=emb_logo 
