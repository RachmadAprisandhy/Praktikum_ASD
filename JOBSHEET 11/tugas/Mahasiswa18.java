public class Mahasiswa18 {
    String NIM, nama;
    
    Mahasiswa18(String NIM, String nama) {
        this.NIM = NIM;
        this.nama = nama;
    }

    void tampilInformasi() {
        System.out.println("NIM: " + NIM + ", Nama: " + nama);
    }
}