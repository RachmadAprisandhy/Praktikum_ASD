import java.util.Scanner;

public class MainPangkat{
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukka jumlah elemen :");
        int elemen = input.nextInt();

        Pangkat [] png = new Pangkat [elemen];
        for (int i = 0 ; i<elemen ; i++){
            System.out.println ("Masukkan nilai Basis elemen ke- " + (i+1) + " : ");
            int basis = input.nextInt();
            System.out.println ("Masukkan nilai Pangkat elemen ke- " + (i+1) + " : ");
            int pangkat = input.nextInt();
            png [i] = new Pangkat(basis, pangkat);
        }

        System.out.println(" Hasil pangkat Brute Force");
        for (Pangkat p : png){
            System.out.println(p.nilai + "^" + p.pangkat + " : " + p.PangkatBF());
        }
        System.out.println(" Hasil pangkat Divide Conquer");
        for (Pangkat p : png){
            System.out.println(p.nilai + "^" + p.pangkat + " : " + p.PangkatDC(p.nilai,p.pangkat));
        }
    }
}