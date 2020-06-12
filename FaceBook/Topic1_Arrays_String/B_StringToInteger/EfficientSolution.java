package FaceBook.Topic1_Arrays_String.B_StringToInteger;

	
import java.io.*;
import java.util.*;
public class EfficientSolution {
/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {
  public static void main(String[] args) {
    // String givenValue = "  -42"; // Output -42
    // String givenValue = "4193 with words"; // Output 4193
    // String givenValue = "words and 987"; // Output 0
    // String givenValue = "+1"; // Output 1
    // String givenValue = " "; // Output 0
    // String givenValue = "2147483648"; // Output 2147483647
    // String givenValue = "-91283472332"; // Output Integer.MIN_VALUE -2147483648
   System.out.println("String to Integer : "+aToI(givenValue));
  }
 
  public static int aToI(String givenValue){
   
    long result = 0;
    givenValue = givenValue.trim();
    // Base conditions
    if(givenValue.isEmpty() || null == givenValue){
      return (int)result;
    }
   
      // Removing the white spaces
     
    char firstChar = givenValue.charAt(0);
   
    boolean isNegative = false;
   
    int index = 0;
   
    if(firstChar == '-'){
      isNegative = true;
    }
   
     if(firstChar == '-' || firstChar == '+'){
      index++;
    }
   
   
   while(index < givenValue.length()){
     if( Character.isDigit(givenValue.charAt(index))){
       
       result = result * 10 + givenValue.charAt(index) - '0';
       
       if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
     
     }
     else{
      break;
     }
       index++;
   }
    return isNegative ? -1 * (int)result : (int)result;
  }
 
}
}
