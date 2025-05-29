public class AntrianKRS18 {
    Mahasiswa18[] data;
    int front;
    int rear;
    int size;
    int max;
    int totalDilayani;

    public AntrianKRS18(int max) {
        this.max = max;
        data = new Mahasiswa18[max];
        front = 0;
        rear = -1;
        size = 0;
        totalDilayani = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void TambahAntrian(Mahasiswa18 mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh. Tidak bisa menambah.");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.nama + " telah ditambahkan ke antrian.");
    }

    public void ProsesKRS() {
        if (size < 2) {
            System.out.println("Tidak cukup mahasiswa untuk proses KRS (minimal 2).");
            return;
        }
        System.out.println("Memproses 2 mahasiswa:");
        for (int i = 0; i < 2; i++) {
            Mahasiswa18 mhs = LayaniMahasiswa();
            System.out.print("- ");
            mhs.tampilkanData();
        }
    }

    public Mahasiswa18 LayaniMahasiswa() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        Mahasiswa18 mhs = data[front];
        front = (front + 1) % max;
        size--;
        totalDilayani++;
        return mhs;
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("Daftar mahasiswa dalam antrian:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void tampilkan2Terdepan() {
        if (size == 0) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("2 Mahasiswa terdepan:");
            for (int i = 0; i < Math.min(2, size); i++) {
                int index = (front + i) % max;
                data[index].tampilkanData();
            }
        }
    }

    public void tampilkanTerakhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            data[rear].tampilkanData();
        }
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan.");
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getJumlahSudahProsesKRS() {
        return totalDilayani;
    }

    public int getSisaBelumProses() {
        return 30 - totalDilayani;
    }
}