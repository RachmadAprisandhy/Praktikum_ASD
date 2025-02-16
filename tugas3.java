import java.util.Scanner;

public class tugas3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Masukkan jumlah mata kuliah: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] namaMK = new String[n];
        int[] sksMK = new int[n];
        int[] semesterMK = new int[n];
        String[] hariMK = new String[n];


        for (int i = 0; i < n; i++) {
            System.out.println("\nMasukkan data untuk mata kuliah ke-" + (i + 1));
            System.out.print("Nama Mata Kuliah: ");
            namaMK[i] = scanner.nextLine();
            System.out.print("Jumlah SKS: ");
            sksMK[i] = scanner.nextInt();
            System.out.print("Semester: ");
            semesterMK[i] = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Hari Kuliah: ");
            hariMK[i] = scanner.nextLine();
        }
        int pilihan;
        do {
            System.out.println("\n===== MENU JADWAL KULIAH =====");
            System.out.println("1. Tampilkan seluruh jadwal kuliah");
            System.out.println("2. Tampilkan jadwal berdasarkan semester");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    tampilkanSeluruhJadwal(namaMK, sksMK, semesterMK, hariMK);
                    break;
                case 2:
                    System.out.print("Masukkan semester yang ingin ditampilkan: ");
                    int cariSemester = scanner.nextInt();
                    tampilkanJadwalSemester(namaMK, sksMK, semesterMK, hariMK, cariSemester);
                    break;
                case 3:
                    System.out.println("Terima kasih! Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (pilihan != 3);

        scanner.close();
    }
    public static void tampilkanSeluruhJadwal(String[] namaMK, int[] sksMK, int[] semesterMK, String[] hariMK) {
        System.out.println("\n===== SELURUH JADWAL KULIAH =====");
        System.out.printf("%-25s %-5s %-10s %-10s\n", "Nama Mata Kuliah", "SKS", "Semester", "Hari Kuliah");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < namaMK.length; i++) {
            System.out.printf("%-25s %-5d %-10d %-10s\n", namaMK[i], sksMK[i], semesterMK[i], hariMK[i]);
        }
    }
    public static void tampilkanJadwalSemester(String[] namaMK, int[] sksMK, int[] semesterMK, String[] hariMK, int cariSemester) {
        System.out.println("\n===== JADWAL KULIAH SEMESTER " + cariSemester + " =====");
        boolean ditemukan = false;
        System.out.printf("%-25s %-5s %-10s %-10s\n", "Nama Mata Kuliah", "SKS", "Semester", "Hari Kuliah");
        System.out.println("--------------------------------------------------");
        for (int i = 0; i < namaMK.length; i++) {
            if (semesterMK[i] == cariSemester) {
                System.out.printf("%-25s %-5d %-10d %-10s\n", namaMK[i], sksMK[i], semesterMK[i], hariMK[i]);
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Tidak ada mata kuliah untuk semester ini.");
        }
    }
    }

