package Java.DetectCycleInLinkedList;


//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class MySolution {

    public static void main(String[] args)
    {
        ListNode list = new ListNode(50);
        list.next = new ListNode(20);
        list.next.next = new ListNode(15);
        list.next.next.next = new ListNode(4);
        list.next.next.next.next = new ListNode(10);

        // Creating a loop for testing
        list.next.next.next.next.next = list.next.next;

        System.out.println("Linked List has a loop : "+hasCycle(list));

    }
    public static boolean hasCycle(ListNode head) {

        if (head == null) return false;

        ListNode current = head;
        ListNode advance = head.next;
        while (current != null && advance != null && advance.next != null) {
            if (current == advance) {
                return true;
            }
            current = current.next;
            advance = advance.next.next;

        }

        return false;

    }
}


