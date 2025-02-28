import java.util.Scanner;
public class MahasiswaDemo18{
    public static void main(String[] args) {
        Scanner sc18 = new Scanner(System.in);
        Mahasiswa18 [] arrayOFMahasiswa = new Mahasiswa18[3];
        String dummy;

        for (int i=0; i < 3  ; i++){
        arrayOFMahasiswa [i] = new Mahasiswa18();

        System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
        System.out.print(" NIM   : ");
        arrayOFMahasiswa[i].NIM = sc18.nextLine();
        System.out.print(" Nama   : ");
        arrayOFMahasiswa[i].nama = sc18.nextLine();
        System.out.print(" Kelas   : ");
        arrayOFMahasiswa[i].kelas = sc18.nextLine();
        System.out.print(" IPK   : ");
        dummy = sc18.nextLine();
        arrayOFMahasiswa[i].IPK = Float.parseFloat(dummy);
        System.out.println("---------------------------------------");
    }
    for(int i=0 ; i < 3; i ++){
        System.out.println("Data Mahasiswa ke-" + (i + 1));
            arrayOFMahasiswa[i].TampilkanInformasi();
        }
    }
}
