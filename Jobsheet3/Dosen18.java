public class Dosen18 {
    String kode;
    String nama;
    boolean jenisKelamin; 
    int usia;

    public Dosen18(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }
    public void tampilkanInfo() {
        System.out.println("Kode Dosen: " + kode);
        System.out.println("Nama Dosen: " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia: " + usia);
        System.out.println("--------------------------");
    }
}