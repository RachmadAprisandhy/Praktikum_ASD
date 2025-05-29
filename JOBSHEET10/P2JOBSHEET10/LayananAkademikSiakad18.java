import java.util.Scanner;
public class LayananAkademikSiakad18 {

    public static void main(String[] args) {
       Scanner sc  = new Scanner(System.in);
        AntrianLayanan18 antrian = new AntrianLayanan18(5);
        int pilihan;
        do {
            System.out.println("=== Layanan Akademik Siakad ===");
            System.out.println("1. Tambah Mahasiswa ke antrian");
            System.out.println("2. Layani mahasiswa");
            System.out.println("3. lihat Mahasiswa Terdepan");
            System.out.println("4. lihat semua antrian");
            System.out.println("5. jumlah mahasiswa dalam antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            
        switch  (pilihan) {
            case 1:
                System.out.print ("NIM : ");
                String NIM = sc.nextLine();
                System.out.print ("Nama : ");
                String nama = sc.nextLine();
                System.out.print ("Prodi : ");
                String prodi = sc.nextLine();
                System.out.print ("Kelas : ");
                String kelas = sc.nextLine();
                Mahasiswa18 mhs = new Mahasiswa18(NIM, nama, prodi, kelas);
                antrian.TambahAntrian(mhs);
                break;
            case 2:
                Mahasiswa18 mahasiswadilayani = antrian.LayaniMahasiswa();
                if (mahasiswadilayani != null) {
                    System.out.println("Melayani mahasiswa : ");
                    mahasiswadilayani.tampilkanData();
                }
                break;
            case 3:
                antrian.lihatTerdepan();
                break;
            case 4:
                antrian.tampilkanSemua();
                break;
            case 5:
                System.out.println("Jumlah dalam antrian: " + antrian.getJumlahAntrian());
                break;
            case 6:
                System.out.println("Terima kasih telah");
                break;
            default:
                System.out.println("Pilihan tidak valid");
        }
        
    }while (pilihan != 6);
        sc.close();
    }

}