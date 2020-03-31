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
        double v = new leet04().findMedianSortedArrays(new int[]{1,3},new int[]{2});
        if(v==2.0){
            System.out.println("通过");
        }else{
            System.out.println("解答错误");
        }
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        return Double.MIN_VALUE;
    }
}