public  class Surat18 {
 String idSurat;
 String namaMahasiswa;
 String Kelas;
 char JenisIzin;
 int durasi;

    public Surat18() {
    }

    public Surat18(String idSurat, String namaMahasiswa, String Kelas, char JenisIzin, int durasi) {
        this.idSurat = idSurat;
        this.namaMahasiswa = namaMahasiswa;
        this.Kelas = Kelas;
        this.JenisIzin = JenisIzin;
        this.durasi = durasi;
    }


     public String getNamaMahasiswa() {
        return namaMahasiswa;
    }

    public void tampilkanSurat() {
        System.out.println("ID Surat: " + idSurat);
        System.out.println("Nama Mahasiswa: " + namaMahasiswa);
        System.out.println("Kelas: " + Kelas);
        System.out.println("Jenis Izin: " + JenisIzin);
        System.out.println("Durasi: " + durasi + " hari");
        System.out.println("----------------------");
    }
}