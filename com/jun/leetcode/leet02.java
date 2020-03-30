package com.jun.leetcode;

/**
 * 2. 两数相加
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * 
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 
 * 示例：
 * 
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class leet02{
    public static void main(String[] args) {
        leet02 leet02 = new leet02();
        ListNode l1 = leet02.new ListNode(2);
        l1.next = leet02.new ListNode(4);
        l1.next.next = leet02.new ListNode(3);

        ListNode l2 = leet02.new ListNode(5);
        l2.next = leet02.new ListNode(6);
        l2.next.next = leet02.new ListNode(4);

        ListNode addTwoNumbers = new leet02().addTwoNumbers(l1, l2);
        
        if(addTwoNumbers.val==7&&addTwoNumbers.next.val==0&&addTwoNumbers.next.next.val==8){
            System.out.println("通过");
        }else{
            System.out.println("解答错误");
        }
    }

    public class ListNode{
        public int val;
        public ListNode next;
        public ListNode(int x){
            val = x;
        }
    }

    /**
     * Definition for singly-linked list.
     * public class ListNode {
     *     int val;
     *     ListNode next;
     *     ListNode(int x) { val = x; }
     * }
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode listNode1 = l1;
        ListNode listNode2 = l2;
        ListNode listNode = null;
        ListNode node = null;
        boolean mod=false;
        while(listNode1!=null&&listNode2!=null){
            int val1 = listNode1.val;
            int val2 = listNode2.val;
            int total = val1+val2;
            int r = total%10;

            if(mod){
                r+=1;
                mod=false;
            }
            if(r>=10||total>=10){
                mod=true;
                if(r>=10){
                    r%=10;
                }
            }
            if(listNode==null){
                listNode = new ListNode(r);
                node = listNode;
            }else{
                node.next = new ListNode(r);
                node=node.next;
            }
            
            listNode1 = listNode1.next;
            listNode2 = listNode2.next;
        }
        while(listNode1!=null){
            int r = listNode1.val;
            if(mod){
                r+=1;
                mod=false;
            }
            if(r>=10){
                mod=true;
                if(r>=10){
                    r%=10;
                }
            }
            node.next = new ListNode(r);
            node = node.next;

            listNode1 = listNode1.next;
        }
        while(listNode2!=null){
            int r = listNode2.val;
            if(mod){
                r+=1;
                mod=false;
            }
            if(r>=10){
                mod=true;
                if(r>=10){
                    r%=10;
                }
            }
            node.next = new ListNode(r);
            node = node.next;

            listNode2 = listNode2.next;
        }
        if(mod){
            node.next = new ListNode(1);
        }
        return listNode;
    }
}