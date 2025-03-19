import java.util.Scanner;
public class Faktorial18main{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai ");
        int nilai = input.nextInt();


        Faktorial18 fk = new Faktorial18();
        System.out.println("Nilai Faktorial " +nilai+ " Menggunakan Brute Force :" + fk.faktorialBF(nilai));
        System.out.println("Nilai Faktorial " +nilai+ " Menggunakan Divide conquer :" + fk.faktorialDC(nilai));
    }
}