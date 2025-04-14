
import java.util.Scanner;

public  class MahasiswaDemo18{

    public static void main(String[] args) {
        
        Scanner sc18 = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa yang ingin diinput: ");
        int JumMHS = sc18.nextInt();
        sc18.nextLine();
        MahasiswaBerprestasi18 list = new MahasiswaBerprestasi18(JumMHS);
       

        for (int i =0; i < JumMHS ; i++){
            System.out.println("Masukkan Data Mahasiswa ke - " + (i + 1));
            System.out.print("Nim : ");
            String Nim = sc18.nextLine();
            System.out.print("Nama : ");
            String Nama = sc18.nextLine();
            System.out.print("Kelas : ");
            String Kelas = sc18.nextLine();
            System.out.print("IPK : ");
            String ip = sc18.nextLine();
            double ipk = Double.parseDouble(ip);
            System.out.println("-----------------------------------------------------");
            list.Tambah (new Mahasiswa18(Nim, Nama, Kelas, ipk));
        }

        list.tampil();
             System.out.println("----------------------------------------------------");
             System.out.println("Pencarian data ");
             System.out.println("----------------------------------------------------");
             System.out.println("Masukkan IPK mahasiswa yang dicari : ");
             System.out.println("IPK : ");
             double cari = sc18.nextDouble();

        //    System.out.println("Menggunakan Sequential searching ");
          //   double posisi = list.sequentialSearching(cari);
            // int pss = (int) posisi;
             //list.tampilposisi(posisi, pss);
             //list.tampilDataSearch(cari, pss);


             System.out.println("---------------------------------------------------");
             System.out.println("Menggunakan Sequential searching ");
             System.out.println("---------------------------------------------------");
             double posisi2 = list.findBinarrySearch(cari, 0, JumMHS-1);
             int pss2 = (int)posisi2;
             list.tampilposisi(cari, pss2);
             list.tampilDataSearch(cari, pss2);
    }
}