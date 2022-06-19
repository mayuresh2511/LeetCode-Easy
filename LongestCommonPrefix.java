package com.leetcode.easy;

public class LongestCommonPrefix {

  public static void main(String[] args) {

    System.out.println(longestCommonPrefix(new String[]{"spring","sprite","sprit"}));
  }

  public static String longestCommonPrefix(String[] stringArray){

    String tempPrefix = "";
    String resultPrefix = "";
    String prevResultPrefix = "";
    Integer index = null;

    for (int i = 1; i < stringArray[0].length(); i++){
        tempPrefix = stringArray[0].substring(0, i);

        for (int j = 1; j < stringArray.length; j++){
          index = stringArray[j].indexOf(tempPrefix);

          if (index == 0){
            resultPrefix = tempPrefix;
          }else{
            resultPrefix = prevResultPrefix;
            break;
          }
        }
        prevResultPrefix = resultPrefix;
    }

    return resultPrefix;
  }
}
