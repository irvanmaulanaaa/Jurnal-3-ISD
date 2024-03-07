public class ListNode {
    buku data;
    ListNode next;

    public ListNode(buku object) {
        data = object;
        this.next = null;
    }
    public buku getData() {
        return data;
    }
}