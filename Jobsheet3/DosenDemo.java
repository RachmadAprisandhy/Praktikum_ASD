import java.util.Scanner;

public class DosenDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah dosen: ");
        int jumlahDosen = scanner.nextInt();
        scanner.nextLine(); 
        
        Dosen18[] daftarDosen = new Dosen18[jumlahDosen];
        
        for (int i = 0; i < jumlahDosen; i++) {
            System.out.println("Masukkan data dosen ke-" + (i + 1) + ":");
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
        }
        DataDosen18.dataSemuaDosen(daftarDosen);
        DataDosen18.jumlahDosenPerJenisKelamin(daftarDosen);
        DataDosen18.rerataUsiaDosenPerJenisKelamin(daftarDosen);
        DataDosen18.infoDosenPalingTua(daftarDosen);
        DataDosen18.infoDosenPalingMuda(daftarDosen);
        }

}