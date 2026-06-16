package WEEK3.Day2;

public class RemoveNthNodeFromEnd {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode front = dummy;
        ListNode back = dummy;

        // front ko n steps aage bhejna
        for (int i = 0; i < n; i++) {
            front = front.next;
        }

        // dono pointers saath chalenge
        while (front.next != null) {
            front = front.next;
            back = back.next;
        }

        // back ke next node ko remove karna hai
        back.next = back.next.next;

        return dummy.next;
    }

    static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    public static void main(String[] args) {
        RemoveNthNodeFromEnd obj = new RemoveNthNodeFromEnd();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        int n = 2;

        ListNode newHead = obj.removeNthFromEnd(head, n);

        printList(newHead);
    }
}