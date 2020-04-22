package Tech.B_AddTwoNumbers;

public class MySolution {

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
    long answer = getNumber(l1) + getNumber(l2);
    // System.out.println(getNumber(l1) +" "+getNumber(l2));
    System.out.println("Answer : " + answer);
    return getLNode(answer);
  }

  private static ListNode getLNode(long answer) {
    long i = 0;
    ListNode prev = null;
    ListNode head = null;
    if (answer == 0) {
      return new ListNode(0);
    }
    while (answer >= 1) {
      long val = answer % 10;
      long v2 = answer % 10;
      // System.out.println("VAL "+ val+" answer "+answer +"  V2 "+v2);

      answer = answer / 10;
      i += 1;
      ListNode current = new ListNode((int) val);
      if (prev != null) {
        prev.next = current;
        prev = prev.next;
      } else {
        prev = current;
        head = prev;
      }
    }
    return head;
  }

  private static long getNumber(ListNode list) {
    long mult = 1;
    long number = 0;
    ListNode head = list;
    while (head != null) {
      // System.out.println("GET NUM -> " + head.val + "  " + mult);
      number = number + (head.val * mult);
      mult *= 10;
      head = head.next;
    }
    return number;
  }
}
