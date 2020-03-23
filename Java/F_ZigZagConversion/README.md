# Zigzag Conversion 

## Description

The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)

P   A   H   N
A P L S I I G
Y   I   R
And then read line by line: "PAHNAPLSIIGYIR"

Write the code that will take a string and make this conversion given a number of rows:

string convert(string s, int numRows);

```
Example 1:

Input: s = "PAYPALISHIRING", numRows = 3
Output: "PAHNAPLSIIGYIR"
Example 2:

Input: s = "PAYPALISHIRING", numRows = 4
Output: "PINALSIGYAHRPI"
Explanation:

P     I    N
A   L S  I G
Y A   H R
P     I

```

## Solution

### Pseudo code:

**My Solution:**

_Step 1:_ Create number of arrays as given number of rows.

_Step 2:_ Develop a formula or pattern for each element and add those elements in those respective arrays

_Step 3:_ Iterate all this arrays in sequence and all the elements into a string and print the string.

**_Time complexity:_**  

The time complexity wil be O(n) for adding all the elements and o(n) for iterating all the elements. The total would be O(n) + O(n) --> O(2n) 
which is _**O(n)**_

**_Space Complexity:_** 

The space complexity will be more because we are creating n number of arrays if there are n rows. Which is not an optimum way

**Why is it failing?**

The solution is complex. As there are several loops to be added to get the result. 

=======================================================================================================================

**Efficient Solution:**

Number of rows: 3

Interval between 2 columns is 4. For example: The distance between "P" at index 0 and "A" at index 4 is 4. And the Distance between
"H" at index 8 and "N" at index 12 is 4.

The step is 2. Step is the number of elements between the 2 columns. For example: The distance between "A" at index 1 and "P" at index 3 is 2.

0 P  |     | 4 A  |     | 8 H   |      | 12 N
1 A  | 3 P | 5 L  | 7 S | 9 I   | 11 I | 13 G
2 Y  |     | 6 I  |     | 10 R  |

_Step 1:_ Create a loop (i --> as each row) on the number of rows. Derive the formula for interval.

Interval formula: 2 * number of rows - 2

_Step 2:_  Derive the formula for _Step_ with respective "i". The step will always be in between 0 & interval.

Step formula : interval - 2 * i 

_Step 3:_ Create a new loop (j --> as each column) and add the elements into a char array. increment the position of the char array to add the element

_Step 4:_ Check the elements are within the loop. As shown in the above example in the first iteration u add the element "Y" which is at index 2. 

_Step 5:_ Repeat the loop until all the elements in the given string are iterated.

**_Time complexity:_**  The time complexity would be **_O(n)_** since it is a Linear search

**_Space Complexity:_** The Space complexity is **_O(1)_** as we are using only 1 array.
