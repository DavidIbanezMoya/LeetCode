package Top100.LinkedLists;

 public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

class SwapNodesInPairs {

    //todo Append them on a list and then just check the previous or following value
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
            if (head == null || head.next == null) {
                return head;
            }

            // Store the next node for recursion
            ListNode nextNode = head.next;

            // Swap the current node and the next node
            head.next = swapPairs(nextNode.next);
            nextNode.next = head;

            // Return the new head (nextNode becomes the head after swapping)
            return nextNode;
        }
}
