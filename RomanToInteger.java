package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {

  public static void main(String[] args) {

    System.out.println(romanToIntegerSimple("LVIII"));
  }

  public static Integer romanToIntegerSimple(String romanNumber){

    Integer integerNumber = 0;
    Integer index = 0;
    Integer prevNumber = Integer.MIN_VALUE;
    Map<String, Integer> romanValues = new HashMap<>();

    romanValues.put("I", 1);
    romanValues.put("V", 5);
    romanValues.put("X", 10);
    romanValues.put("L", 50);
    romanValues.put("C", 100);
    romanValues.put("D", 500);
    romanValues.put("M", 1000);

    while(index < romanNumber.length()){

      if(prevNumber < romanValues.get(romanNumber.substring(index, index + 1))){
        integerNumber -= prevNumber;
        integerNumber += (romanValues.get(romanNumber.substring(index, index + 1)) - prevNumber);
      }else{
        integerNumber += romanValues.get(romanNumber.substring(index, index + 1));
      }
      prevNumber = romanValues.get(romanNumber.substring(index, index + 1));
      index++;
    }
    return integerNumber;
  }
}
