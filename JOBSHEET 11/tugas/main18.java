import java.util.Scanner;

public class main18 {
    public static void main(String[] args) {
        Linkedlist18 queue = new Linkedlist18();
        Scanner sc = new Scanner(System.in);
        int pilih;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Mahasiswa ke Antrian");
            System.out.println("2. Panggil Mahasiswa");
            System.out.println("3. Lihat Semua Antrian");
            System.out.println("4. Lihat Antrian Terdepan dan Terakhir");
            System.out.println("5. Lihat Jumlah Antrian");
            System.out.println("6. Kosongkan Antrian");
            System.out.println("7. Cek Antrian Kosong");
            System.out.println("8. Cek Antrian Penuh");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();
                    Mahasiswa18 m = new Mahasiswa18(nim, nama);
                    queue.enqueue(m);
                    break;
                case 2:
                    Mahasiswa18 keluar = (Mahasiswa18) queue.panggil();
                    if (keluar != null) {
                        System.out.print("Mahasiswa dipanggil: ");
                        keluar.tampilInformasi();
                    }
                    break;
                case 3:
                    queue.printQueue();
                    break;
                case 4:
                    Mahasiswa18 depan = (Mahasiswa18) queue.peekFront();
                    Mahasiswa18 belakang = (Mahasiswa18) queue.peekRear();
                    if (depan != null) {
                        System.out.print("Mahasiswa terdepan: ");
                        depan.tampilInformasi();
                    }
                    if (belakang != null) {
                        System.out.print("Mahasiswa terakhir: ");
                        belakang.tampilInformasi();
                    }
                    break;
                case 5:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + queue.getSize());
                    break;
                case 6:
                    queue.clear();
                    break;
                case 7:
                    System.out.println(queue.cekKosong() ? "Antrian kosong." : "Antrian tidak kosong.");
                    break;
                case 8:
                    System.out.println(queue.cekPenuh() ? "Antrian penuh." : "Antrian belum penuh.");
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 0);
    }
}