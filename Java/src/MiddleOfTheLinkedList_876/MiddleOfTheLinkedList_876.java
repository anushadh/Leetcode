package MiddleOfTheLinkedList_876;

import java.util.ArrayList;

class Solution {
    public static ListNode middleNode(ListNode head) {
//        ArrayList<ListNode> nodeList = new ArrayList<>();
//        int length = 0;
//        while(head != null) {
//            nodeList.add(head);
//            head = head.next;
//            length++;
//        }
//        return nodeList.get(length/2);

        ListNode tail = head;
        ListNode middle = head;

        while (tail != null && tail.next != null) {
            middle = middle.next;
            tail = tail.next.next;
        }
        return middle;
    }

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);
        System.out.println(middleNode(node));

    }
}
