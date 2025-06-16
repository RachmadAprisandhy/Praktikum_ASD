public class Node18 {
    public Mahasiswa18 data;
    public Node18 prev;
    public Node18 next;

    public Node18(Mahasiswa18 data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
     public Node18 search(Node18 head, String nim) {
        Node18 current = head;
        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
}