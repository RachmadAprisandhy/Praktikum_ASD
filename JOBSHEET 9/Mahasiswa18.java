public class Mahasiswa18 {
    String NIM;
    String nama;    
    String kelas;
    int nilai;


    Mahasiswa18(String NIM, String nama, String kelas) {
        this.NIM = NIM;
        this.nama = nama;
        this.kelas = kelas;
        nilai = -1;
    }

    void tugasDinilai(int nilai) {
        this.nilai = nilai;
    }
}