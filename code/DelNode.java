public class DelNode {
    public static void main(String[] args) {

    }

    public void deleteNode(ListNode node) {
        if (node == null || node.next == null) return;

        ListNode p = node.next, par = node;
        while (p != null) {
            node.val = p.val;
            par = node;
            node = node.next;
            p = node.next;
        }
        par.next = null;
    }
}

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
