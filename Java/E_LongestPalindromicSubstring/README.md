# 


## Description



```
** Example: **



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

_Step 1:_

_Step 2:_

**_Time complexity:_**  
For a string of 7 characters
We end up with  16 combinations
and for 1000 characters we end up with 2200 combinations -> O(2n) which is  O(n)
**_Space Complexity:_** 

**Why is it failing?**

=======================================================================================================================

**Efficient Solution:**

_Step 1:_

_Step 2:_

**_Time complexity:_**  

**_Space Complexity:_** 