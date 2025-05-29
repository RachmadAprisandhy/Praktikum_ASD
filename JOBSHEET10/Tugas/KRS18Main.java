import java.util.Scanner;

public class KRS18Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKRS18 antrian = new AntrianKRS18(10);

        int pilihan;
        do {
            System.out.println("\n=== Layanan Akademik Siakad ===");
            System.out.println("1. Tambah Mahasiswa ke antrian");
            System.out.println("2. Proses 2 mahasiswa (KRS)");
            System.out.println("3. Lihat 2 mahasiswa terdepan");
            System.out.println("4. Lihat semua antrian");
            System.out.println("5. Lihat mahasiswa terakhir");
            System.out.println("6. Cek antrian kosong/penuh");
            System.out.println("7. Kosongkan antrian");
            System.out.println("8. Cetak jumlah antrian");
            System.out.println("9. Cetak jumlah sudah proses & belum");
            System.out.println("10. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    Mahasiswa18 mhs = new Mahasiswa18(nim, nama, prodi, kelas);
                    antrian.TambahAntrian(mhs);
                    break;
                case 2:
                    antrian.ProsesKRS();
                    break;
                case 3:
                    antrian.tampilkan2Terdepan();
                    break;
                case 4:
                    antrian.tampilkanSemua();
                    break;
                case 5:
                    System.out.println("Mahasiswa terakhir:");
                    antrian.tampilkanTerakhir();
                    break;
                case 6:
                    System.out.println("Antrian kosong? " + antrian.isEmpty());
                    System.out.println("Antrian penuh? " + antrian.isFull());
                    break;
                case 7:
                    antrian.clear();
                    break;
                case 8:
                    System.out.println("Jumlah mahasiswa dalam antrian: " + antrian.getJumlahAntrian());
                    break;
                case 9:
                    System.out.println("Sudah proses KRS: " + antrian.getJumlahSudahProsesKRS());
                    System.out.println("Sisa belum proses: " + antrian.getSisaBelumProses());
                    break;
                case 10:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 10);
    }
}