# Sliding Window Technique

This technique shows how a nested for loop in few problems can be converted to single for loop and hence reducing the time complexity. Especially it is considered as a technique that could reduce the time complexity from `O(n²)` to `O(n)`.

**There are two types of sliding window:**
<br>
**_Fixed window length k:_** the length of the window is fixed and it asks you to find something in the window such as the maximum sum of all windows, the maximum or median number of each window. Usually we need kind of variables to maintain the state of the window, some are as simple as a integer or it could be as complicated as some advanced data structure such as list, queue or deque.
<br>
**_Two pointers + criteria:_** the window size is not fixed, usually it asks you to find the subarray that meets the criteria, for example, given an array of integers, find the number of subarrays whose sum is equal to a target value. the window size is not fixed, usually it asks you to find the subarray that meets the criteria, for example, given an array of integers, find the number of subarrays whose sum is equal to a target value.