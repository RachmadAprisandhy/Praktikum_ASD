public class Linkedlist18 {
    NodeMhs18 head, tail;
    int size = 0;
    final int MAX_SIZE = 10;

    boolean isEmpty() {
        return head == null;
    }

    boolean isFull() {
        return size == MAX_SIZE;
    }

    void enqueue(Mahasiswa18 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        NodeMhs18 baru = new NodeMhs18(mhs);
        if (isEmpty()) {
            head = tail = baru;
        } else {
            tail.next = baru;
            tail = baru;
        }
        size++;
    }

    Mahasiswa18 panggil() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return null;
        }
        Mahasiswa18 data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return data;
    }

    void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Isi Antrian:");
            NodeMhs18 temp = head;
            while (temp != null) {
                temp.data.tampilInformasi();
                temp = temp.next;
            }
        }
    }

    void clear() {
        head = tail = null;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    Mahasiswa18 peekFront() {
        return isEmpty() ? null : head.data;
    }

    Mahasiswa18 peekRear() {
        return isEmpty() ? null : tail.data;
    }

    int getSize() {
        return size;
    }

    boolean cekKosong() {
        return isEmpty();
    }

    boolean cekPenuh() {
        return isFull();
    }
}