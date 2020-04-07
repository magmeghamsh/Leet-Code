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

Observations: Average of middle two elements if it is an even number, return the middle number if it is odd.

_Step 1:_ Create a new array by adding the elemnts of the 2 array.

_Step 2:_ Sort the elements in the array using Arrays.sort()

_Step 3:_ If the length of the array is even then return the average of middle two elements. Else return the middle element Index of (arr.length-1)/2

**_Time complexity:_**  Since Arrays.sort() uses quick sort, O(n^2) for the worst case.

**_Space Complexity:_** O(1)

**Why is it failing?**

Eventhough it does the job,the Algortihm is not efficient in terms of time complexity and am using predefined arrays sort

=======================================================================================================================

**Efficient Solution:**

Using _binary search_ we can optimize the solution.

consider 2 arrays as below

x -> x1  ,  x2  , x3

y -> y1  ,  y2  ,  y3  ,  y4  ,  y5  

Split the arrays in a way that sum on the left is equal to sum on the right

low = 0,  high = xlength // starting index and high is ending

partitionX = (low + high)/2; // 0 + 3 /2 = 1

Partition formula --> partitionX + partitionY = (xlength + ylength + 1)/2   // add 1 to handle the odd case /

partitionY = 4 - 1 = 3

By using the above 2 formulas we would get a split array as below

        x1    |    x2  x3
        
  y1 y2  y3   |    y4  y5
  
  
  the LHS = RHS = 4
  
_condition 1 :_  x1 <= y4 maxLeftX <= minRightY && y3 <= x2 maxLeftY < minRightX 

means the split of the array is right in the middle

now we have to find the median of x1,y3, x2, y4 

   if the total length of the arrays combined is even then 

    Math.max(maxLeftX, maxLeftY) + Math.min(minRightX, minRightY)) / 2  is the median    
    
    else Math.max(maxLeftX, minRightY)   
    
_If condition 1 is not met :_ maxLeftX > minRightY
   
   the partition on Y has to be moved left, since maxLeftX > minRightY
   
_If condition 2 is not met :_ 

the partition on X has to be moved right


**_Time complexity:_**  In the above approach, we are splitting array and sorting them to find the median, this leads to **_O(Log(m+n))_**

**_Space Complexity:_** O(1)

**Additional Reference:**
https://www.youtube.com/watch?time_continue=2&v=LPFhl65R7ww&feature=emb_logo 
