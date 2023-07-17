package Top100.LinkedLists;

 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class SwapNodesInPairs {


    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            ListNode node = new ListNode();
            node.val = i+1;
            if (node.val > i) {
                //Should check the value
                node.next = new ListNode(node.val+1);
            }
            swapPairs(node);
        }
    }
    public static ListNode swapPairs(ListNode head) {
        //Check if the number is even, since we are only swapping the pairs
        //System.out.println(head.val);
        if (head.val%2 != 0) {
            int auxiliar = head.val;
            head.val = head.next.val;
            head.next.val = auxiliar;
        }
        else {
            head.val --;
        }
        System.out.println(head.val);
        return head;
    }
}
