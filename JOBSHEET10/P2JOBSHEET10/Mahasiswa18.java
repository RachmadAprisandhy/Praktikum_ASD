public class Mahasiswa18 {

    String NIM;
    String nama;
    String prodi;
    String kelas;


    public Mahasiswa18(String NIM, String nama, String prodi, String kelas) {
        this.NIM = NIM;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println(NIM + " " + nama + " " + prodi + " " + kelas);
    }
}