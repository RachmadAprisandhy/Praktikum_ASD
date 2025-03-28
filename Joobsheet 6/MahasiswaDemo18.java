import java.util.Scanner;

public class MahasiswaDemo18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MahasiswaBerprestasi18 list = new MahasiswaBerprestasi18();

        System.out.print("Masukkan Jumlah Mahasiswa: ");
        int jmlmhs = input.nextInt();
        input.nextLine(); 

        for (int i = 0; i < jmlmhs; i++) {
            System.out.println("Masukkan Data mahasiswa ke - " + (i + 1));

            System.out.print("NIM : ");
            String nim = input.nextLine();

            System.out.print("Nama : ");
            String nama = input.nextLine();

            System.out.print("Kelas : ");
            String kelas = input.nextLine();

            System.out.print("IPK : ");
            double ipk = input.nextDouble();
            input.nextLine(); 


            Mahasiswa18 MHA = new Mahasiswa18(nim, nama, kelas, ipk);
            list.tambah(MHA);
        }


        System.out.println("Data mahasiswa sebelum sorting:");
        list.tampil();

  
        list.bubblesort();


        System.out.println("Data Mahasiswa setelah sorting berdasarkan IPK (DESC):");
        list.tampil();
    }
}