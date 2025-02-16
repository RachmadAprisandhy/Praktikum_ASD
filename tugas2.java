import java.util.Scanner;

public class tugas2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        double sisi;
        

        do {
            System.out.println("===== DaVinci Calculator =====");
            System.out.println("1. Hitung Volume Kubus");
            System.out.println("2. Hitung Luas Permukaan Kubus");
            System.out.println("3. Hitung Keliling Kubus");
            System.out.println("4. Keluar");
            System.out.println("==============================");

            System.out.print("Silahkan Pilih menu (1-4): ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan panjang sisi kubus: ");
                    sisi = scanner.nextDouble();
                    System.out.println("Volume kubus: " + hitungVolume(sisi));
                    break;
                case 2:
                    System.out.print("Masukkan panjang sisi kubus: ");
                    sisi = scanner.nextDouble();
                    System.out.println("Luas permukaan kubus: " + hitungLuasPermukaan(sisi));
                    break;
                case 3:
                    System.out.print("Masukkan panjang sisi kubus: ");
                    sisi = scanner.nextDouble();
                    System.out.println("Keliling kubus: " + hitungKeliling(sisi));
                    break;
                case 4:
                    System.out.println("Terima kasih! Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }

            System.out.println(); 

        } while (pilihan != 4);

        scanner.close();
    }
    public static double hitungVolume(double sisi) {
        return sisi * sisi * sisi;
    }
    public static double hitungLuasPermukaan(double sisi) {
        return 6 * (sisi * sisi);
    }
    public static double hitungKeliling(double sisi) {
        return 12 * sisi;
    }
}
