package com.liang.erhua.arithmetic;

/**
 * 算法1：
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
 *
 * 示例:
 *
 * 给定 nums = [2, 7, 11, 15], target = 9
 *
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 * @author ${user}
 * @version 1.0
 * @date ${time}/${date}
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] twoSum = twoSum(nums, 26);
        for (int i : twoSum) {
            System.out.println(i);
        }
    }
    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0,len = nums.length;i < len;i++){
            for(int j = i + 1;j < len;j++){
                if(i != j && target == nums[i]+nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }
}
