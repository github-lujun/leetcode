package com.jun.leetcode;

/**
 * 
 * 1. 两数之和
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
 * 
 */
public class leet01 {
    public static void main(String[] args) {
        int[] twoSum = new leet01().twoSum(new int[]{2,7,11,15}, 9);
        if(twoSum[0]==0&&twoSum[1]==1){
            System.out.println("ac");
        }else{
            System.out.println("");
        }
        
    }
    public int[] twoSum(int[] nums, int target) {
        int[] r = new int[2];
        boolean falg=false;
        for(int i = 0;i<nums.length;i++){
            int num = target-nums[i];
            for(int j = i+1;j<nums.length;j++){
                if(nums[j]==num){
                    r[0] = i;
                    r[1] = j;
                    falg=true;
                    break;
                }
            }
            if(falg){
                break;
            }
        }
        return r;
    }
}