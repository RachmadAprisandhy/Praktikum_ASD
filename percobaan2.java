import java.util.Scanner;

public class percobaan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("masukkan angka anda = ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0 || i==6 || i==10) { 
                System.out.print("*  ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}