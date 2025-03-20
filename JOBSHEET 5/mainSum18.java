import java.util.Scanner;

public class mainSum18{
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan jumlah Elemen : ");
        int elemen = input.nextInt();


        sum18 sm = new sum18(elemen);
        for(int i=0;i<elemen;i++){
            System.out.println("Masukkan keuntungan ke =");
            sm.Keuntungan[i] = input.nextDouble();
        }

        System.out.println("Total Keuntungan menggungakan Brute Force :" +sm.totalBF());
        System.out.println("Total Keuntungan menggungakan Divide Conquer :" + sm.totalDC(sm.Keuntungan, 0, elemen - 1 ));
    }
}