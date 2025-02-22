public class matakuliahMain18 {

    public static void main(String[] args) {
        matakuliah18 MK1 = new matakuliah18();

        MK1.kodeMK = "ALSD";
        MK1.nama = "Algoritma Struktur Data";
        MK1.sks = 2;
        MK1.jumlahJam = 6;


        MK1.tampilkanInformasi();
        MK1.tambahJam(8);
        MK1.ubahSks(3);
        MK1.tampilkanInformasi();

        matakuliah18 MK2 = new matakuliah18("Sisop", "Sistem Operasi" , 5 , 8);
        MK2.kurangiJumlahJam(6);
        MK2.tampilkanInformasi();

    }
}