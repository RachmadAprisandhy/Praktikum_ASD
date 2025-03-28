public class DataDosen {
    String kode;
    String nama;
    boolean jenisKelamin;
    int usia;

    public DataDosen() {
    }

    public DataDosen(String kode, String nama, boolean jenisKelamin, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public void tampilInformasi() {
        System.out.println("Kode : " + kode);
        System.out.println("Nama : " + nama);
        System.out.println("Jenis Kelamin : " + (jenisKelamin ? "Laki-laki" : "Perempuan"));
        System.out.println("Usia : " + usia);
        System.out.println("-----------------------------------");
    }
}