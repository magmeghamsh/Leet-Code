# Complexity Analysis

The efficency of a algorithm is evaluated based on the time and space consumed.

## Time Complexity Analysis

Time Complexity of algorithm/code is not equal to the actual time required to execute a particular code but the number of times a statement executes. 
For example if you execute a _for loop_ in any language the time taken by to complete the loop will vary on different platforms/machines. Instead of measuring actual time required in executing each statement in the code, `consider how many times each statement is executed`.

For better understanding of the time complexity lets consider the below example.

**Example :** A class has 100 students in which you gave a pen to a student. Now you want the Pen back. Below are the ways to get your Pen.

**`O`** --> Order in the below notations. Pronounced “big-oh" 

_**Case 1 :**_ If only one student knows on which student has the pen.
<br>
_**`O(n²)`:**_ You go and ask the first residentRequest of the class, if he has the pen. Also, you ask this residentRequest about other 99 people in the classroom if 
they have that pen and so on.

_**Case 2 :**_ If one student had the pen and only they knew it.
<br>
**_`O(n):`_** Going and asking each student individually.

_**Case 3 :**_ If all the students knew, but would only tell me if I guessed the right side.
<br>
**_`O(log n):`_** Now I divide the class into two groups, then ask: “Is it on the left side, or the right side of the classroom?” Then I take that group and divide it into two and ask again, and so on. Repeat the process till you are left with one student who has your pen.
 
**Reference :** [Geeks for geeks](https://www.geeksforgeeks.org/understanding-time-complexity-simple-examples/)

## Space Complexity Analysis

Space complexity is a measure of the amount of working storage an algorithm needs. That means how much memory is needed at any point in the algorithm. As with time complexity, we're mostly concerned with how the space needs grow, in big-Oh terms, as the size N of the input problem grows.

**Additional Info :** 
[Click here](https://courses.cs.northwestern.edu/311/html/space-complexity.html)

https://www.youtube.com/watch?v=BBpAmxU_NQo&t=262s