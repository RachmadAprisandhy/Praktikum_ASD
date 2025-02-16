import java.util.Scanner;

public class PercobaanArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        double totalbobot = 0.0;
        int totalsks = 0;

        double nilaiangka[] = new double[8];
        String nilaihuruf[] = new String[8];
        double bobotnilai[] = new double[8];
        int sks[] = {2, 2, 2, 3, 2, 2, 3, 2}; 
        
        String matkul[] = {
            "Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving",
            "Rekayasa Perangkat Lunak", "matematika dasar", "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};

        System.out.println("======================");
        System.out.println("Selamat datang di portal hitung nilai IP");  
        System.out.println("======================"); 
        System.out.println("hitung IP kalian untuk memotifasi belajar");        
        System.out.println("======================");
        System.out.println("======================");

        

        for (int i = 0; i < nilaiangka.length; i++) {
            System.out.print("Masukkan nilai angka untuk MK " + matkul[i] + ": ");
            nilaiangka[i] = sc.nextDouble();
            if (nilaiangka[i] > 80 && nilaiangka[i] <= 100) {
                nilaihuruf[i] = "A";
                bobotnilai[i] = 4.00;
            } else if (nilaiangka[i] > 73 && nilaiangka[i] <= 80) {
                nilaihuruf[i] = "B+";
                bobotnilai[i] = 3.50;
            } else if (nilaiangka[i] > 65 && nilaiangka[i] <= 73) {
                nilaihuruf[i] = "B";
                bobotnilai[i] = 3.00;
            } else if (nilaiangka[i] > 60 && nilaiangka[i] <= 65) {
                nilaihuruf[i] = "C+";
                bobotnilai[i] = 2.50;
            } else if (nilaiangka[i] > 50 && nilaiangka[i] <= 60) {
                nilaihuruf[i] = "C";
                bobotnilai[i] = 2.00;
            } else if (nilaiangka[i] > 39 && nilaiangka[i] <= 50) {
                nilaihuruf[i] = "D";
                bobotnilai[i] = 1.00;
            } else {
                nilaihuruf[i] = "E";
                bobotnilai[i] = 0.00;
            }
        }       
        
        System.out.println("======================");
        System.out.printf("\n%-40s %-15s %-15s %-15s %-10s\n", "MK", "Nilai Angka", "Nilai Huruf", "Boffot Nilai", "SKS");       
        System.out.println("======================");

        for (int i = 0; i < bobotnilai.length; i++) {
            System.out.printf("%-40s %-15.2f %-15s %-15.2f %-10d\n", matkul[i], nilaiangka[i], nilaihuruf[i], bobotnilai[i], sks[i]);
            totalbobot += bobotnilai[i] * sks[i];
            totalsks += sks[i];
        }
        double ip = totalbobot / totalsks;      
        System.out.println("======================");
        System.out.print("IP : " + ip);
    }
}