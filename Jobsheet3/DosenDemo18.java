import java.util.Scanner;

public class DosenDemo18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          
        Dosen18[] daftarDosen = new Dosen18[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1));
            System.out.print("Kode Dosen: ");
            String kode = scanner.nextLine();
            
            System.out.print("Nama Dosen: ");
            String nama = scanner.nextLine();
            
            System.out.print("Jenis Kelamin (L untuk Laki-laki, P untuk Perempuan): ");
            char jk = scanner.next().charAt(0);
            boolean jenisKelamin = (jk == 'L' || jk == 'l');
            
            System.out.print("Usia: ");
            int usia = scanner.nextInt();
            scanner.nextLine(); 
            
            daftarDosen[i] = new Dosen18(kode, nama, jenisKelamin, usia);

            System.out.println("-------------------------------------------------");
        }
        
        for (Dosen18 dosen : daftarDosen) {
            dosen.tampilkanInfo();
        }
        
        scanner.close();
    }
}