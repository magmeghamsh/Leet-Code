package LeetCode.Misc;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

public class ValidParentheses {

  public static void main(String[] args) {
    String givenBraces = "()";
    System.out.println("Is valid Parentheses: " + isValid(givenBraces));
  }

  public static boolean isValid(String s) {
    if (null == s) return true;
    Set<String> braces = new HashSet<>();
    braces.add("(");
    braces.add("{");
    braces.add("[");

      Stack<Character> stack = new Stack<>();
    for (char c : s.toCharArray()){
        if(braces.contains(Character.toString(c))){
            stack.push(c);
        } else if(c == ')' && !stack.isEmpty() && stack.peek() == '('){
            stack.pop();
        } else if(c == '}' && !stack.isEmpty() && stack.peek() == '{'){
            stack.pop();
        } else if(c == ']' && !stack.isEmpty() && stack.peek() == '['){
            stack.pop();
        }
    }
    return stack.isEmpty();
  }
}
