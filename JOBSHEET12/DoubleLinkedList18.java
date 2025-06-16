public class DoubleLinkedList18 {
    private Node18 head;
    private Node18 tail;

    public DoubleLinkedList18() {
        head = null;
        tail = null;
    }
    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa18 data) {
        Node18 newNode = new Node18(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa18 data) {
        Node18 newNode = new Node18(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter (String Nim, Mahasiswa18 data){
        Node18 current = head;

        while (current != null && !current.data.nim.equals(Nim)) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("node dengan NIM " + Nim + " tidak ditemukan.");
            return;
        }
        Node18 newNode = new Node18(data);

        if (current == tail) {
            current.next = newNode;
            newNode.prev = current;
            tail = newNode;
        } else {
            newNode.next = current.next;
            newNode.prev = current;
            current.next.prev = newNode;
            current.next = newNode;
        }
    }

   public void print () {
    if (isEmpty()) {
        System.out.println("List masih kosong.");
        return;
    }
    Node18 current = head;
    while (current != null) {
        current.data.tampil();
        current = current.next;
    }
}
     public Node18 search(String nim) {
    Node18 current = head;
    while (current != null) {
        if (current.data.nim.equals(nim)) {
            return current;
        }
        current = current.next;
    }
    return null;
}
public void removeFirst() {
    if (isEmpty()) {
        System.out.println("List kosong, tidak bisa menghapus.");
    } if (head == tail) {
        head = tail = null;
    } else {
        head = head.next;
        head.prev = null;
    }
    System.out.println("Data pertama berhasil dihapus.");
}

public void removeLast() {
    if (isEmpty()) {
        System.out.println("List kosong, tidak bisa menghapus.");
    } if (head == tail) {

        head = tail = null;
    } else {
        tail = tail.prev;
        tail.next = null;
    }
    System.out.println("Data terakhir berhasil dihapus.");
}

}