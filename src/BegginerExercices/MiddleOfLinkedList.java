package BegginerExercices;

import java.util.LinkedList;

/*
Given the head of a singly linked list, return the middle node of the linked list.

If there are two middle nodes, return the second middle node.*/
public class MiddleOfLinkedList {

    LinkedList<ListNode> listNode = new LinkedList<>();

    public static void main(String[] args) {

        MiddleOfLinkedList middle = new MiddleOfLinkedList();
        middle.listNode = middle.createNodes(middle.listNode,8);
        ListNode node = middle.middleNode(middle.listNode.get(middle.listNode.size()-1));
        System.out.println(node);
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
    }

    public LinkedList<ListNode> createNodes(LinkedList<ListNode> list, int number) {
        for (int i = 0; i < number; i++) {
            list.add(new ListNode(i));
        }
        return list;
    }
    public ListNode middleNode(ListNode head) {
        if (head.val > 100) {
            return new ListNode(0);
        }
        for (int i = head.val/2; i < head.val; i++) {
            if (i+1 <= head.val) {
                ListNode node = new ListNode();
                node.val = i;
                node.next = new ListNode(i+1);
                return new ListNode(node.val,node.next);
            }

        }
        System.out.println("Here");
        return new ListNode(0);
    }
}
