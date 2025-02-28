import java.util.Scanner;

public class MataKuliahDemo18 {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMataKuliah = sc18.nextInt();
        sc18.nextLine(); 

        MataKuliah18[] arrayOfMataKuliah = new MataKuliah18[jumlahMataKuliah];

    
        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.println("Masukkan Data Mata Kuliah ke-" + (i + 1));
            arrayOfMataKuliah[i] = new MataKuliah18(); 
            arrayOfMataKuliah[i].tambahData(sc18); 
        }
        for (int i = 0; i < jumlahMataKuliah; i++) {
            System.out.println("Data Mata Kuliah ke-" + (i + 1));
            System.out.println("Kode       : " + arrayOfMataKuliah[i].Kode);
            System.out.println("Nama       : " + arrayOfMataKuliah[i].Nama);
            System.out.println("SKS        : " + arrayOfMataKuliah[i].sks);
            System.out.println("Jumlah Jam : " + arrayOfMataKuliah[i].JumlahJam);
            System.out.println("----------------------------------------");
        }

        sc18.close(); 
    }
}

