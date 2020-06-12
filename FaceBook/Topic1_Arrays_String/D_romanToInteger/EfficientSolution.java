import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class EfficientSolution {
  public static void main(String[] args) {
     String givenValue = "III"; // Output 3
     //String givenValue = "IV"; // Output 4
     //String givenValue = "IX"; // Output 9
     //String givenValue = "LVIII"; // Output 58
     //String givenValue = "MCMXCIV"; // Output 1994
    //String givenValue = "DCXXI"; //O/p: 621
     System.out.println("Roman to Integer : "+romanToInteger(givenValue));
  }
 
  public static int romanToInteger(String givenValue){
   
    Map<Character,Integer> romanMap = new HashMap<>();
   
    romanMap.put('I',1);
    romanMap.put('V',5);
    romanMap.put('X',10);
    romanMap.put('L',50);
    romanMap.put('C',100);
    romanMap.put('D',500);
    romanMap.put('M',1000);
   
    int rightPointer =1, leftPointer =0, result = 0;
   
    while(rightPointer < givenValue.length()){
      int leftVal = romanMap.get(givenValue.charAt(leftPointer));
     
      int rightVal = romanMap.get(givenValue.charAt(rightPointer));
     
      if(leftVal < rightVal){
        leftPointer+=2;
        rightPointer+=2;
        result = result + Math.abs(leftVal-rightVal);
      } else{
        leftPointer++;
        rightPointer++;
        result = result + leftVal;
      }
     
    }
   
    if(leftPointer != givenValue.length()){
      leftPointer++;
      int leftLeftVal = romanMap.get(givenValue.charAt(--leftPointer));
      int leftVal = romanMap.get(givenValue.charAt(leftPointer));
      if(leftLeftVal < leftVal){
        result = result + Math.abs(leftLeftVal-leftVal);
      } else{
        result = result + leftVal;
      }
     
     
    }
   
    return result;
  }
 
}