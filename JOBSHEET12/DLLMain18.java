import java.util.Scanner;
public class DLLMain18 {
    public static void main(String[] args) {
        DoubleLinkedList18 List = new DoubleLinkedList18();
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\nMenu Double Linked List Mahasiswa");
            System.out.println("1. Tambah di awal");
            System.out.println("2. Tambah di akhir");
            System.out.println("3. Hapus di awal");
            System.out.println("4. Hapus di akhir");
            System.out.println("5. Tampilkan data");
            System.out.println("6. Cari Mahasiswa berdasarkan NIM");
            System.out.println("7. Tambah setelah data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> {
                    Mahasiswa18 mhs = inputMahasiswa(scanner);
                    List.addFirst(mhs);
                }
                case 2 -> {
                    Mahasiswa18 mhs = inputMahasiswa(scanner);
                    List.addLast(mhs);
                }
                case 3 -> List.removeFirst();
                case 4 -> List.removeLast();
                case 5 -> List.print();
                case 6 -> {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String nim = scanner.nextLine();
                    Node18 found = List.search(nim);
                    if (found != null) {
                        System.out.println("Data ditemukan:");
                        found.data.tampil();
                    } else {
                        System.out.println("Data tidak ditemukan");
                    }
                }
                case 7 -> {
                    System.out.print("Masukkan NIM yang dicari: ");
                    String cariNIM = scanner.nextLine();
                    System.out.print("Masukkan NIM baru: ");
                    String nimBaru = scanner.nextLine();
                    System.out.print("Masukkan nama: ");
                    String namaBaru = scanner.nextLine();
                    System.out.print("Masukkan kelas: ");
                    String kelasBaru = scanner.nextLine();
                    System.out.print("Masukkan ipk: ");
                    double ipkBaru = scanner.nextDouble();
                    Mahasiswa18 mhsBaru = new Mahasiswa18 (nimBaru, namaBaru, kelasBaru, ipkBaru);
                    List.insertAfter(cariNIM, mhsBaru);
                }
                case 0 -> System.out.println("Keluar dari program");
                default -> System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        scanner.close();
    }

    public static Mahasiswa18 inputMahasiswa(Scanner sc) {
        System.out.print("Masukkan NIM: ");
        String nim = sc.nextLine();
        System.out.print("Masukkan Nama: ");
        String nama = sc.nextLine();
        System.out.print("Masukkan Kelas: ");
        String kelas = sc.nextLine();
        System.out.print("Masukkan IPK: ");
        double ipk = sc.nextDouble();
        sc.nextLine();

        return new Mahasiswa18(nim, nama, kelas, ipk);
    }
}