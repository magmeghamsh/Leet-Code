# Add Two Numbers

## Description

Given a string, find the length of the longest substring without repeating characters.

Single Linked list is given.

```
Example :

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
             
```
## Solution

### Pseudo code:

**My Solution:**

_Step 1:_ Write a method which will take input as the node and returns the number as long

In this method, you would create a number by using the node thru the below algorithm

Each element * its unit position

For example: 342 ==> 3 *1 + 4 * 10 + 5 * 100;

_Step 2:_ add the numbers (list 1 + list 2)

_Step 3:_ Convert the (int)sum into ListNode

**_Time complexity:_**  O(n)

**_Space Complexity:_** O(1)

**Why is it failing?**

The Solution fails if the ListNode is more than the Long value

=======================================================================================================================

**Efficient Solution:**

_Step 1:_ 

_Step 2:_

**_Time complexity:_**  O(n)

**_Space Complexity:_** O(1)