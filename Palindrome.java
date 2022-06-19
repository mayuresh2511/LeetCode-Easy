package com.leetcode.easy;

public class Palindrome {

  public static void main(String[] args) {

    System.out.println(checkIfPalindrome(1251));
  }

  public static Boolean checkIfPalindrome(int number){

    String numStr = String.valueOf(number);

    for(int i = 0; i < numStr.length()/2 ; i++){
      if (! numStr.substring(i, i+1).equals(numStr.substring(numStr.length() - 1 - i, numStr.length() - i))){
        return false;
      }
    }
    return true;
  }
}
