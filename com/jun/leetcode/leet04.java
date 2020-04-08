package com.jun.leetcode;

// 4. 寻找两个有序数组的中位数
// 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2。

// 请你找出这两个有序数组的中位数，并且要求算法的时间复杂度为 O(log(m + n))。

// 你可以假设 nums1 和 nums2 不会同时为空。

// 示例 1:

// nums1 = [1, 3]
// nums2 = [2]

// 则中位数是 2.0
// 示例 2:

// nums1 = [1, 2]
// nums2 = [3, 4]

// 则中位数是 (2 + 3)/2 = 2.5
public class leet04{
    public static void main(String[] args) {
        double v = new leet04().findMedianSortedArrays(new int[]{1,2},new int[]{3,4});
        if(v==2.5){
            System.out.println("通过");
        }else{
            System.out.println("解答错误");
        }
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length+nums2.length];
        System.arraycopy(nums1, 0, nums, 0, nums1.length);
        System.arraycopy(nums2, 0, nums, nums1.length, nums2.length);
        java.util.Arrays.sort(nums);
        if(nums.length%2==1){
            return nums[nums.length/2];
        }else{
            return (nums[nums.length/2-1]+nums[nums.length/2])/2.0;
        }
    }
}