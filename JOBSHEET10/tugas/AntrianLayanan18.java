public class AntrianLayanan18 {
   Mahasiswa18[] data;
   int front;
    int rear;
    int size;
    int max;
    
    public AntrianLayanan18 (int max){
        this.max = max;
        this.data = new Mahasiswa18[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (size == max) {
            return true;
        } else {
            return false;
        }
    }

    public void lihatTerdepan() {
        if (!isEmpty()) {
            System.out.println("Antrian kosong ");
        } else {
            System.out.println("mahasiswa terdepan: ");
            System.out.println("NIM - NAMA - PRODI - KELAS");
            data[front].tampilkanData();
        }
    }

    public void tampilkanSemua  () {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        } else {
              System.out.println("Daftar mahasiswa dalam antrian:");
              System.out.println("NIM - NAMA - PRODI - KELAS");
              for (int i = 0 ; i < size ; i++) {
                  int index = (front + i) % max;
                  System.err.println((i + 1) + ". ");
                  data[index].tampilkanData();
              }
        }
    }

    public void clear () {
        if (!isEmpty()) {
            front = rear = -1;
            size = 0;
            System.out.println("Queue berhasil dikosongkan");
        } else {
            System.out.println("Queue masih kosong");
        }
    }

    public void TambahAntrian (Mahasiswa18 mhs ) {
        if (isFull()) {
        System.out.println("antrian sudah penuh (overflow). Program dihentikan.");
        return;
        } 
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.err.println(mhs.nama +"telah masuk ke antrian");
}

    public Mahasiswa18 LayaniMahasiswa () {
    if (isEmpty()) {
        System.out.println("Antrian masih kosong.");
        return null;
    } 
    Mahasiswa18 mhs = data[front];
    front = (front + 1) % max;
    size--;
    return mhs;
}
public int getJumlahAntrian() {
    return size;

}

public void LihatAkhir() {
    if (isEmpty()) {
        System.out.println("Antrian kosong");
    } else {
        System.out.println("Mahasiswa di posisi paling belakang:");
        System.out.println("NIM - NAMA - PRODI - KELAS");
        data[rear].tampilkanData();
    }
}

}