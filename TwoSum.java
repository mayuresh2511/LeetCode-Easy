package com.leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TwoSum {

  public static void main(String[] args) {

    Integer[] numbers = new Integer[]{2,7,11,15};
    System.out.println(twoSumBruteforce(numbers, 19));
    System.out.println(twoSumHashMap(numbers, 9));
    System.out.println(twoSumTwoPointer(numbers, 9));
  }

  public static List<Integer> twoSumBruteforce(Integer[] numbers, Integer targetSum){

    List<Integer> resultList = new ArrayList<>();
    Integer sum = 0;

    for (int i = 0; i < numbers.length - 1; i++){
      for (int j = i + 1; j < numbers.length; j++){
        sum = numbers[i] + numbers[j];
        if (sum == targetSum){
          resultList.add(i);
          resultList.add(j);
          break;
        }
      }
    }
    return resultList;
  }

  public static List<Integer> twoSumHashMap(Integer[] numbers, Integer targetSun){

    List<Integer> resultList = new ArrayList<>();
    Map<Integer, Integer> sumMap = new HashMap<>();

    for(int i = 0; i < numbers.length; i++){
      if (sumMap.containsKey(targetSun - numbers[i])){
        resultList.add(sumMap.get(targetSun - numbers[i]));
        resultList.add(i);
        break;
      }else{
        sumMap.put(numbers[i], i);
      }
    }
    return resultList;
  }

  public static List<Integer> twoSumTwoPointer(Integer[] numbers, Integer targetSum){

    List<Integer> resultList = new ArrayList<>();
    Integer start = 0, end = numbers.length - 1;
    Integer sum = 0;

    while(end > start){

      sum = numbers[start] + numbers[end];

      if(sum == targetSum){
        resultList.add(start);
        resultList.add(end);
        break;
      }else if(sum < targetSum){
        start++;
      }else if (sum > targetSum){
        end--;
      }
    }
    return resultList;
  }
}
