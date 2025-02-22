public class DosenMain18 {
    public static void main(String[] args) {
        
        Dosen18 Dsn1 = new Dosen18();

        Dsn1.IdDosen = "A66778";
        Dsn1.Nama = "Paidi";
        Dsn1.statusAktif = false;
        Dsn1.TahunBergabung = 2007;
        Dsn1.BidangKeahlian = "Matematika";

        Dsn1.TampilkanInformasi();
        Dsn1.SetStatusDosen(true);
        Dsn1.HitungMasaKerja(2025);
        Dsn1.UbahKeahlian("Pemrograman");
        Dsn1.TampilkanInformasi();

        Dosen18 Dsn2 = new Dosen18("B7789", "Paijo", false, 1998, "Sejarah");
        Dsn2.TampilkanInformasi();
        Dsn2.SetStatusDosen(false);
        Dsn2.HitungMasaKerja(2025);
        Dsn2.UbahKeahlian("Antropologi");
        Dsn2.TampilkanInformasi();
    }
}