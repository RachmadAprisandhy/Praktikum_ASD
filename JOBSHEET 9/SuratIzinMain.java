import java.util.Scanner;
public class SuratIzinMain {
    public static void main(String[] args) {
        StackSurat18 stack = new StackSurat18(5);
        Scanner scan = new Scanner(System.in);
        int pilih;

        do {
            System.out.println(" ==========================");
            System.out.println(" Menu : ");
            System.out.println(" ==========================");
            System.out.println("1. terima surat izin");
            System.out.println("2. proses surat izin");
            System.out.println("3. lihat surat izin terakhir");
            System.out.println("4. cari surat izin");
            System.out.println("5. keluar");
            System.out.print("Pilih menu : ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("idSurat : ");
                    String IdSurat = scan.nextLine();
                    System.out.print("Nama Mahasiswa : ");
                    String namaMahasiswa = scan.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (I/S/A) : ");
                    char jenisIzin = scan.nextLine().charAt(0);
                    System.out.print("Durasi (hari) : ");
                    int durasi = scan.nextInt();
                    Surat18 surat = new Surat18(IdSurat, namaMahasiswa, kelas, jenisIzin, durasi);
                    stack.push(surat);
                    System.out.printf("Surat izin %s berhasil diterima\n", surat.namaMahasiswa);
                    break;
                case 2:
                    Surat18 proses = stack.pop();
                    if (proses != null) {
                        System.out.println("Proses surat izin dari " + proses.namaMahasiswa);
                        System.out.printf("Surat izin %s telah diproses\n", proses.namaMahasiswa);
                    }
                    break;
                case 3:
                    Surat18 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("Surat izin terakhir diterima dari " + lihat.namaMahasiswa);
                        lihat.tampilkanSurat();
                    }
                    break;
                case 4:
                    System.out.print("Masukkan NIM yang dicari: ");
                    String carinama = scan.nextLine();
                    boolean ditemukan = false;
                    for (int i = 0; i <= stack.top; i++) {
                        if (stack.stack[i].namaMahasiswa.equals(carinama)) {
                            System.out.println("Surat izin ditemukan:");
                            stack.stack[i].tampilkanSurat();
                            ditemukan = true;
                            break;
                        }
                    }
                    if (!ditemukan) {
                        System.out.println("Surat izin dengan NIM " + carinama + " tidak ditemukan.");
                    }
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }

        } while (pilih != 5);
        scan.close();
    }
}