public class matakuliah18 {
   String kodeMK;
   String nama;
   int sks;
   int jumlahJam;

   
    public matakuliah18() {
    }

   
    public matakuliah18(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    
    public void tampilkanInformasi() {
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("Jumlah SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    
    public void ubahSks(int sksBaru) {
        this.sks = sksBaru;
    }


    public void tambahJam(int jamBaru) {
        this.jumlahJam += jamBaru;
    }

    public void kurangiJumlahJam(int penguranganJam) {
        if (this.jumlahJam - penguranganJam < 0) {
            System.out.println("Pengurangan tidak valid! Jumlah jam tidak boleh kurang dari 0.");
        } else {
            this.jumlahJam -= penguranganJam;
        }
    }

}
