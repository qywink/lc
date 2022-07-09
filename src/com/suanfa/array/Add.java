package com.suanfa.array;

import java.util.Arrays;

/*
* 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。

你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。

你可以按任意顺序返回答案。

 

来源：力扣（LeetCode）
链接：https://leetcode.cn/problems/two-sum
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。*/
public class Add {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 3, 8};
        int target = 3;


        //int[] ints = twoSum(arr, target);
        //String s = Arrays.toString(ints);

        System.out.println("下标为：" + Arrays.toString(index(arr,target)));
    }
    public static int[] index(int[] arr, int target){

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == target){
                return new int[]{i,j};
                }
            }

        }
        return new int[0];
    }

/*    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }*/
}


