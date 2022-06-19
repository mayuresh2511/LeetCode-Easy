package com.leetcode.easy;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

public class ValidParentheses {

  public static void main(String[] args) {

    System.out.println(validParenthesis("((()))()"));

    System.out.println(validParenthesisDifferent("()[]{}"));
  }

  public static Boolean validParenthesis(String parentheses){

    String[] parenthesesArray = parentheses.split("");
    Stack<String> parenthesesStack = new Stack<>();

    for (String str : parenthesesArray){
      if (str.equals("(")){
        parenthesesStack.add(str);
      }else{
        if(parenthesesStack.isEmpty()){
          return false;
        }else{
          parenthesesStack.pop();
        }
      }
    }

    if (!parenthesesStack.isEmpty()){
      return false;
    }
    return true;
  }

  public static Boolean validParenthesisDifferent(String parentheses){

    String[] parenthesesArray = parentheses.split("");
    Stack<String> parenthesesStack = new Stack<>();

    for (String str : parenthesesArray){
      if (str.equals("(") || str.equals("{") || str.equals("[") ){
        parenthesesStack.add(str);
      }else{
        if(parenthesesStack.isEmpty()){
          return false;
        }else{
          if(!checkIfValid(str, parenthesesStack.pop())){
            return false;
          }
        }
      }
    }

    if (!parenthesesStack.isEmpty()){
      return false;
    }
    return true;
  }

  private static boolean checkIfValid(String str, String pop) {

    if (str.equals(")") && pop.equals("(")){
      return true;
    }else if(str.equals("}") && pop.equals("{")){
      return true;
    }else if(str.equals("]") && pop.equals("[")){
      return true;
    }else{
      return false;
    }
  }
}

