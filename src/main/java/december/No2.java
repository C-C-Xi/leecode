package december;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class No2 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String num1 = "";
        String num2 = "";
        ListNode l3 = l1;
        while (l3 != null) {
            num1 += l3.val;
            l3 = l3.next;
        }
        l3 = l2;
        while (l3 != null) {
            num2 += l3.val;
            l3 = l3.next;
        }
        long num3 = Long.parseLong(new StringBuffer(num1).reverse().toString());
        long num4 = Long.parseLong(new StringBuffer(num2).reverse().toString());
        long sum = num3 + num4;
        String str = String.valueOf(sum);
        long length = str.length();

        ListNode l4 = null;
        ListNode l5 = null;
        for (int i = 0; i < length; i++) {
            int c = Integer.parseInt(String.valueOf(str.charAt(i)));
            l4 = new ListNode(c, l5);
            l5 = l4;
        }
        return l4;
    }




    public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
        ListNode l4 = null;
        ListNode l5 = null;
        ListNode l6 = l1;
        ListNode l7 = l2;

        List<Integer> list = new ArrayList<Integer>();
        boolean flags = false;
        while (l6 != null || l7 != null||flags) {
            int a = l6 == null ? 0 : l6.val;
            int b = l7 == null ? 0 : l7.val;
            int c = a + b;
            if (flags) {
                c += 1;
            }
            if (c >= 10) {
                c = c - 10;
                flags = true;
            } else {
                flags = false;
            }
            l6 = l6 == null ? null : l6.next;
            l7 = l7 == null ? null : l7.next;
            list.add(c);
        }
        Collections.reverse(list);
        for (int item : list) {
            l4 = new ListNode(item, l5);
            l5 = l4;
        }
        return l4;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
