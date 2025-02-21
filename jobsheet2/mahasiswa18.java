import java.util.Scanner;

public class mahasiswa18 {

    String nama;
    String NIM;
    String Kelas;
    double IPK;

    void TampilkanInformasi(){
        System.out.println("Nama :"+ nama);
        System.out.println("NIM  :"+ NIM);
        System.out.println("Kelas:"+ Kelas);
        System.out.println("IPK  :"+ IPK);
    }
    void ubahkelas(String KelasBaru){
        Kelas = KelasBaru;
    }
    void updateIPK(double IPKBaru){
        if (IPKBaru < 0.0 || IPKBaru > 4.0){
            System.out.println("IPK tidak valid harus di rentang 0.0 - 4.0");
        }else{
            IPK = IPKBaru;
        }
    }
    String nilaiKerja(){
        if (IPK >= 3.5){
            return "Kinerja Sangat Baik";
        }else if(IPK >= 3.0){
            return "Kinerja Baik";
        }else if (IPK >= 2.0){
            return "Kinerja Cukup";
        }else{
            return"kinerja Kurang";
        }
    }

    public mahasiswa18 (){

    }

    public mahasiswa18 (String nm, String NIM, double IPK , String kls){
        nama = nm;
        this.NIM = NIM;
        this.IPK = IPK;
        Kelas = kls;

    }
}