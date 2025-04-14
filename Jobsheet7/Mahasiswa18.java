public class Mahasiswa18 {
    String Nim;
    String Nama;
    String Kelas;
    Double ipk;


    Mahasiswa18(){

    }

    public Mahasiswa18(String Nim, String Nama, String Kelas, Double Ipk) {
        this.Nim = Nim;
        this.Nama = Nama;
        this.Kelas = Kelas;
        this.ipk = Ipk;
    }

    void  TampilInformasi(){
        System.out.println("nama : " + Nama);
        System.out.println("NIM : " + Nim);
        System.out.println("Kelas : " + Kelas);
        System.out.println("IPK : " + ipk);
    }
}