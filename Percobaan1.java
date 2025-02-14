import java.util.Scanner;

public class Percobaan1 {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);

        double tugas, kuis, uts, uas, nilaiAkhir;
        System.out.println("Selamat datang di portal nilai");
        System.out.println("Masukkan nilai anda");
        System.out.println("===================================");

        System.out.print("Masukkan nilai tugas = ");
        tugas = sc18.nextDouble();
        if (tugas < 0 || tugas > 100) {
            System.out.println("Nilai tidak valid");
            return;
        }

        System.out.print("Masukkan nilai kuis = ");
        kuis = sc18.nextDouble();
        if (kuis < 0 || kuis > 100) {
            System.out.println("Nilai tidak valid");
            return;
        }

        System.out.print("Masukkan nilai UTS = ");
        uts = sc18.nextDouble();
        if (uts < 0 || uts > 100) {
            System.out.println("Nilai tidak valid");
            return;
        }

        System.out.print("Masukkan nilai UAS = ");
        uas = sc18.nextDouble();
        if (uas < 0 || uas > 100) { 
            System.out.println("Nilai tidak valid");
            return;
        }

        nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);

     
        String nilaiHuruf;
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A";
            System.out.println("Selamat anda lulus");
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+";
            System.out.println("Selamat anda lulus");
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B";
            System.out.println("Selamat anda lulus");
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+";
            System.out.println("Selamat anda lulus");
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C";
            System.out.println("Selamat anda lulus");
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D";
            System.out.println("maaf anda tidak lulus");
        } else {
            nilaiHuruf = "E";
            System.out.println("maaf anda tidak lulus") ;
        }

        System.out.println("Nilai akhir mahasiswa: " + nilaiAkhir);
        System.out.println("Nilai huruf: " + nilaiHuruf);

        sc18.close();
    }
}