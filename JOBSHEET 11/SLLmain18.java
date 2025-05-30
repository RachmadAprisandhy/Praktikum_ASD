import java.util.Scanner;

public class SLLmain18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SingledLinkedList18 sll = new SingledLinkedList18();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlah = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data Mahasiswa ke-" + (i + 1));
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = Double.parseDouble(sc.nextLine());

            Mahasiswa18 mhs = new Mahasiswa18(nim, nama, kelas, ipk);
            sll.addLast(mhs);
        }

        System.out.println("\n=== Daftar Mahasiswa ===");

        System.out.println("data index 1:");
        sll.getData(1);

        System.out.println("data mahasiswa an Bimon berada pada index: " + sll.indexOf("Bimon"));
        System.out.println();

        sll.removeFirst();
        sll.removeLast();
        sll.print();
        sll.removeAt(0);
        sll.print();
    }
}
