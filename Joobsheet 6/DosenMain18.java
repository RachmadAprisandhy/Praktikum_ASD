import java.util.Scanner;

public class DosenMain18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DosenDemo list = new DosenDemo(10);

        while (true) {
            System.out.println("======== Menu Pilihan ========");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Mengurutkan data dosen (ASC) Bubble Sort");
            System.out.println("4. Mengurutkan data dosen (DESC) Selection Sort");
            System.out.println("5. Mengurutkan data dosen (ASC) Insertion Sort");
            System.out.println("6. Keluar");
            System.out.println("================================");

            System.out.print("Masukkan pilihan anda: ");
            int pilihan = input.nextInt();
            input.nextLine(); 

            if (pilihan == 1) {
                System.out.print("Masukkan Kode: ");
                String kode = input.nextLine();
                System.out.print("Masukkan Nama: ");
                String nama = input.nextLine();
                System.out.print("Masukkan jenis kelamin (m/f): ");
                char jk = input.next().charAt(0);
                boolean jenisKelamin = (jk == 'm' || jk == 'M');
                System.out.print("Masukkan usia: ");
                int usia = input.nextInt();
                input.nextLine(); 

                DataDosen DSN = new DataDosen(kode, nama, jenisKelamin, usia);
                list.tambah(DSN);
                System.out.println("Data Dosen Ditambahkan!");

            } else if (pilihan == 2) {
                System.out.println("Daftar Dosen:");
                list.tampil();
            } else if (pilihan == 3) {
                list.bubblesort();
                System.out.println("Data diurutkan dari usia terkecil.");
                list.tampil();
            } else if (pilihan == 4) {
                list.selectionsort();
                System.out.println("Data diurutkan dari usia terbesar.");
                list.tampil();
            } else if (pilihan == 5) {
                list.insertionsort();
                System.out.println("Data diurutkan dari usia terbesar.");
                list.tampil();
            } else if (pilihan == 6) {
                System.out.println("Program selesai.");
                break;
            } else {
                System.err.println("Pilihan tidak valid!");
            }
        }
        input.close();
    }
}