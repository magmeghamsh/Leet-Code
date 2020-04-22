# RotateImage

## Description
You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

Note:

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. 
DO NOT allocate another 2D matrix and do the rotation.

```
** Example: **

Example 1:

Given input matrix = 
[
  [1,2,3],
  [4,5,6],
  [7,8,9]
],

rotate the input matrix in-place such that it becomes:
[
  [7,4,1],
  [8,5,2],
  [9,6,3]
]
Example 2:

Given input matrix =
[
  [ 5, 1, 9,11],
  [ 2, 4, 8,10],
  [13, 3, 6, 7],
  [15,14,12,16]
], 

rotate the input matrix in-place such that it becomes:
[
  [15,13, 2, 5],
  [14, 3, 4, 1],
  [12, 6, 8, 9],
  [16, 7,10,11]
]


```

## Solution

### Pseudo code:

**My Solution:**

_Step 1:
Transpose the matrix --> swap(matrix[i][j] ,matrix[j][i])

Original Array

[1, 2, 3]
[4, 5, 6]
[7, 8, 9]

After transposing Array
[1, 4, 7]
[2, 5, 6]
[3, 8, 9]

_Step 2:_
Then flip the matrix horizontally like a symmetric or mirror image --> swap(matrix[i][j] ,matrix[i][matrix.length-1-j])



**_Time complexity:_**  

**_Space Complexity:_** 

**Why is it failing?**

