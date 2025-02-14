import java.util.Scanner;

public class percobaan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i ==10){
                System.out.print("* ");
            }
            if (i % 2 != 0) { 
                System.out.print("* ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
}