

public class SingledLinkedList18 {
    NodeMahasiswa18 head;
    NodeMahasiswa18 tail;

    boolean isEmpty() {
        return head == null;
    }
    public void print () {
        if (!isEmpty()) {
           NodeMahasiswa18 tmp = head;
           System.out.println("isi linked lis : \t");
              while (tmp != null) {
                tmp.data.tampilInformasi();;
                tmp = tmp.next;
              }
              System.out.println("");
        }
        else {
            System.out.println("Linked list kosong.");
        }
    
    }

    public void addFirst(Mahasiswa18 input) {
        NodeMahasiswa18 NdInput = new NodeMahasiswa18(input, null);
        if (isEmpty()) {
            head = NdInput;
            tail = NdInput;
        } else {
            NdInput.next = head;
            head = NdInput;
        }
    }

    public void addLast(Mahasiswa18 input) {
        NodeMahasiswa18 NdInput = new NodeMahasiswa18(input, null);
        if (isEmpty()) {
            head = NdInput;
            tail = NdInput;
        } else {
            tail.next = NdInput;
            tail = NdInput;
        }
    }

    public void insertafter (String key, Mahasiswa18 input) {
        NodeMahasiswa18 NdInput = new NodeMahasiswa18(input, null);
        NodeMahasiswa18 temp = head;
        do { 
            if (temp.data.nama.equalsIgnoreCase(key)) {
                NdInput.next = temp.next;
                temp.next = NdInput;
                if (NdInput.next == null) {
                    tail = NdInput;
                }
                break;
            }
            temp = temp.next;
        } while (temp != null);
    }

    public void insertat (int index, Mahasiswa18 input) {
        if (index < 0) {
            System.out.println("index salah");
        }else if (index == 0) {
            addFirst(input);
        } else {
            NodeMahasiswa18 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = new NodeMahasiswa18(input, temp.next);
            if (temp.next.next == null) {
                tail = temp.next;
            }
        }
    }
    public void getData (int index) {
        NodeMahasiswa18 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
            }
            tmp.data.tampilInformasi();
        }
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus.");
        } else if (head == tail) {
           head = tail = null;
        } else {
            head = head.next;
            }
        }
    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus.");
        } else if (head == tail) {
            head = tail = null;
        } else {
            NodeMahasiswa18 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }
    public void remove (String key) {
        if (isEmpty()) {
            System.out.println("Linked list masih kosong, tidak dapat dihapus.");
    }else {
        NodeMahasiswa18 temp = head;
        while (temp != null) {
            if ((temp.data.nama.equalsIgnoreCase(key)) && (temp == head)) {
               this.removeFirst();
               break;
            } else if (temp.data.nama.equalsIgnoreCase(key)) {
                temp.next = temp.next.next;
                if (temp.next == null) {
                    tail = temp;
                }
                break;
    }
    temp = temp.next;
        
            }
        
        }
    }

    public void removeAt(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            NodeMahasiswa18 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
            if (temp.next == null) {
                tail = temp;
            }
        }
          
    }
public int indexOf(String key) {
        NodeMahasiswa18 temp = head;
        int index = 0;
        while (temp != null && !temp.data.nama.equalsIgnoreCase(key)) {
            temp = temp.next;
            index++;
        }
        if (temp == null) {
            return -1;
        }else{
        return index;
    }

}

}



