public class Mahasiswa18 {
    String NIM, nama , kelas ;
    double IPK;

    Mahasiswa18(String NIM, String nama, String kelas, double IPK) {
        this.NIM = NIM;
        this.nama = nama;
        this.kelas = kelas;
        this.IPK = IPK;
    }

    public void tampilInformasi() {
        System.out.println("NIM: " + NIM +"Nama: " + nama + "Kelas: " + kelas + "IPK: " + IPK);
    }
}