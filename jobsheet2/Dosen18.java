public  class Dosen18 {

    String IdDosen;
    String Nama;
    boolean statusAktif;
    int TahunBergabung;
    String BidangKeahlian;
    int MasaKerja;

    public Dosen18(){


    }
    public Dosen18(String Id,String nm,boolean sttsAktif,int TahunBrgbng,String bdgKeahlian){
        IdDosen = Id;
        Nama = nm;
        this.statusAktif = sttsAktif;
        TahunBergabung = TahunBrgbng;
        BidangKeahlian = bdgKeahlian;
    }

    void TampilkanInformasi(){
        System.out.println("Id DOsen: " + IdDosen);
        System.out.println("Nama: " + Nama);
        System.out.println("Status Aktif Dosen: " + statusAktif);
        System.out.println("Bidang keahlian Dosen: " + BidangKeahlian);
    }

    void SetStatusDosen(boolean StatusDosen) {
        this.statusAktif = StatusDosen;
        if (StatusDosen == true) {
            System.out.println("Dosen aktif");
        } else {
            System.out.println("Dosen tidak aktif");
        }
    }

    void UbahKeahlian (String KeahlianBaru){
        BidangKeahlian = KeahlianBaru;
    }

    void HitungMasaKerja (int tahunSaatini){
        MasaKerja = tahunSaatini - TahunBergabung ;
        System.out.println("Masa kerja: " + MasaKerja + " tahun");
    }
}