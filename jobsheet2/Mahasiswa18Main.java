

public class Mahasiswa18Main{
    public static void main(String[] args) {
        
        mahasiswa18 mhs1 = new mahasiswa18();
        mhs1.nama = "Rachmad a";
        mhs1.NIM = "244107020148";
        mhs1.Kelas = "TI-1B";
        mhs1.IPK = 3.68;

        mhs1.TampilkanInformasi();
        mhs1.ubahkelas("TI-1C");
        mhs1.updateIPK(4.0);
        mhs1.TampilkanInformasi();

        mahasiswa18 mhs2 = new mahasiswa18("Anissa Nabila","244207030149",3.4,"TI-1A");
        mhs2.updateIPK(3.6);
        mhs2.TampilkanInformasi();

        mahasiswa18 mhsRAprisandhy = new mahasiswa18("R.Aprisandhy","244307040150",3.8,"TI-1D") ;
        mhsRAprisandhy.TampilkanInformasi();
    }
}