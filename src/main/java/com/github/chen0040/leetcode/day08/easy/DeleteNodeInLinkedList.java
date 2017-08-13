package com.github.chen0040.leetcode.day08.easy;


/**
 * Created by xschen on 3/8/2017.
 *
 * summary:
 * Write a function to delete a node (except the tail) in a singly linked list, given only access to that node.
 * Supposed the linked list is 1 -> 2 -> 3 -> 4 and you are given the third node with value 3, the linked list should become 1 -> 2 -> 4 after calling your function.
 *
 * link: https://leetcode.com/problems/delete-node-in-a-linked-list/description/
 */
public class DeleteNodeInLinkedList {
     public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

   public class Solution {
      public void deleteNode(ListNode node) {
         node.val = node.next.val;
         node.next = node.next.next;
      }
   }
}