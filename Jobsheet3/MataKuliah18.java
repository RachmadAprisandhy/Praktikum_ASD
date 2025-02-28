import java.util.Scanner;

public class MataKuliah18{
    public String Kode;
    public String Nama;
    public int sks;
    public int JumlahJam;


   public MataKuliah18(){
    }
    
    public void TampilkanInformasi() {
        System.out.println("Kode       : " + Kode);
        System.out.println("Nama       : " + Nama);
        System.out.println("SKS        : " + sks);
        System.out.println("Jumlah Jam : " + JumlahJam);
        System.out.println("----------------------------------------");
    }
    public void tambahData(Scanner sc) {
        System.out.print("Kode       : ");
        this.Kode = sc.nextLine();
        System.out.print("Nama       : ");
        this.Nama = sc.nextLine();
        System.out.print("SKS        : ");
        this.sks = sc.nextInt();
        System.out.print("Jumlah Jam : ");
        this.JumlahJam = sc.nextInt();
        sc.nextLine(); 
        System.out.println("----------------------------------------");
    }
}