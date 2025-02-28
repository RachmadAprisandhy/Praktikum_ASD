public class MahasiswaDemo18{
    public static void main(String[] args) {
        Mahasiswa18 [] arrayOFMahasiswa = new Mahasiswa18[3];

        arrayOFMahasiswa[0] = new Mahasiswa18();
        arrayOFMahasiswa[0].NIM ="244107020148";
        arrayOFMahasiswa[0].nama = "Rachmad Aprisandhy";
        arrayOFMahasiswa[0].kelas = "TI-1B";
        arrayOFMahasiswa[0].IPK = (float) 3.65;

        arrayOFMahasiswa[1] = new Mahasiswa18();
        arrayOFMahasiswa[1].NIM ="244592658899";
        arrayOFMahasiswa[1].nama = "Paijo";
        arrayOFMahasiswa[1].kelas = "TI-1f";
        arrayOFMahasiswa[1].IPK = (float) 3.33;

        arrayOFMahasiswa[2] = new Mahasiswa18();
        arrayOFMahasiswa[2].NIM ="244109080045";
        arrayOFMahasiswa[2].nama = "Chloe";
        arrayOFMahasiswa[2].kelas = "SIB-1B";
        arrayOFMahasiswa[2].IPK = (float) 3.85;


        System.out.println("NIM     :" + arrayOFMahasiswa[0].NIM);
        System.out.println("NAMA    :" + arrayOFMahasiswa[0].nama);
        System.out.println("KELAS   :" + arrayOFMahasiswa[0].kelas);
        System.out.println("IPK     :" + arrayOFMahasiswa[0].IPK);
        System.out.println("----------------------------------------");

        System.out.println("NIM     :" + arrayOFMahasiswa[1].NIM);
        System.out.println("NAMA    :" + arrayOFMahasiswa[1].nama);
        System.out.println("KELAS   :" + arrayOFMahasiswa[1].kelas);
        System.out.println("IPK     :" + arrayOFMahasiswa[1].IPK);
        System.out.println("----------------------------------------");

        System.out.println("NIM     :" + arrayOFMahasiswa[2].NIM);
        System.out.println("NAMA    :" + arrayOFMahasiswa[2].nama);
        System.out.println("KELAS   :" + arrayOFMahasiswa[2].kelas);
        System.out.println("IPK     :" + arrayOFMahasiswa[2].IPK);  
        System.out.println("----------------------------------------");
    }
}