package Tech.B_AddTwoNumbers;

public class EfficientSolution {

    public static void main(String[] args) {

        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode answerNode = addTwoNumbers(l1, l2);
        System.out.println("Node value: " + answerNode);

    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode prev = new ListNode(0);
        ListNode head = prev;
        int carry = 0;
        while(l1 != null || l2 != null){
            ListNode cur = new ListNode(0);
            int sum = ((null != l1) ? l1.val : 0) + ((null != l2) ? l2.val : 0) + carry;
            cur.val = sum%10;
            carry = sum /10;
            System.out.println("Current: "+cur.val+"Sum : "+sum+ "Carry: "+carry);

            prev.next = cur;
            prev = cur;
            l1 = (l1 == null) ? l1 : l1.next;
            l2 = (l2 == null) ? l2 : l2.next;
        }
        return head.next;
    }
}

