import java.util.Scanner;
public class MataKuliahDemo18{
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);
        MataKuliah18 [] arrayOfMataKuliah = new MataKuliah18[3];
        String Kode,Nama,dummy;
        int sks,JumlahJam;

        for (int i = 0; i < 3;i++){
            System.out.println("Masukkan Data Matakuliah ke-" + (i +1));
            System.out.print("Kode      :");
            Kode = sc18.nextLine();
            System.out.print("nama      :");
            Nama = sc18.nextLine();
            System.out.print("SKS      :");
            dummy = sc18.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("JumlahJam      :");
            dummy = sc18.nextLine();
            JumlahJam = Integer.parseInt(dummy);
            System.out.println("----------------------------------------");

            arrayOfMataKuliah[i] = new MataKuliah18(Kode, Nama, sks, JumlahJam);
        }



    }
}