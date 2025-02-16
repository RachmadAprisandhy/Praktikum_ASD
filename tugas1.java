import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kode plat nomor Anda : ");
        char input = scanner.next().toUpperCase().charAt(0);

        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};

        
        String[] KOTA = {
            "BANTEN","JAKARTA","BANDUNG","CIREBON","BOGOR","PEKALONGAN",
            "SEMARANG","SURABAYA","MALANG","TEGAL" 
        };

        boolean ditemukan = false;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == input) {
                System.out.println("Kota asal dari plat " + input + " adalah " + KOTA[i]);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan.");
        }
        scanner.close();
    }
}