class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class Problem5 {

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode a = headA;
        ListNode b = headB;

        while (a != b) {
            if (a == null)
                a = headB;
            else
                a = a.next;

            if (b == null)
                b = headA;
            else
                b = b.next;
        }

        return a;
    }

    public static void main(String[] args) {

        ListNode common = new ListNode(8);
        common.next = new ListNode(4);
        common.next.next = new ListNode(5);

        ListNode headA = new ListNode(4);
        headA.next = new ListNode(1);
        headA.next.next = common;

        ListNode headB = new ListNode(5);
        headB.next = new ListNode(6);
        headB.next.next = new ListNode(1);
        headB.next.next.next = common;

        ListNode result = getIntersectionNode(headA, headB);

        if (result != null)
            System.out.println("Intersection Node: " + result.val);
        else
            System.out.println("No Intersection");
    }
}