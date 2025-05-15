import java.util.Scanner;
public  class MahasiswaDemo18 {
    public static void main(String[] args) {
        StackTugasMahasiswa18 stack = new StackTugasMahasiswa18(5);
        Scanner scan = new Scanner(System.in);
        int pilih;


        do {
            System.out.println("\nMenu : ");
            System.out.println("1. mengumpulkan tugas");
            System.out.println("2. menilai tugas");
            System.out.println("3. melihat tugas teratas");
            System.out.println("4. melihat daftar tugas");
            System.out.println("5. melihat tugas terbawah");
            System.out.println("6. melihat jumlah tugas");
            System.out.print("Pilih menu : ");
            pilih = scan.nextInt();
            scan.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Nama : ");
                    String nama = scan.nextLine();
                    System.out.print("NIM : ");
                    String NIM = scan.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = scan.nextLine();
                    Mahasiswa18 mhs = new Mahasiswa18(NIM, nama, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikumpulkan\n", mhs.nama);
                    break;
                case 2:
                    Mahasiswa18 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.println("menilai tugas dari" + dinilai.nama);
                        System.out.print("masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Nilai tugas %s adalah %d\n", dinilai.nama, nilai);
                    }
                    break;
                case 3:
                    Mahasiswa18 lihat = stack.peek();
                    if (lihat != null) {
                        System.out.println("tugas terakhir dikumpulkan oleh" + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                case 5:
                    Mahasiswa18 pertama = stack.palingbawah();
                    if (pertama != null) {
                        System.out.println("Tugas pertama dikumpulkan oleh " + pertama.nama);
                    }
                    break;
                case 6:
                    int jumlah = stack.jumlahTugas();
                    System.out.printf("Jumlah tugas yang sudah dikumpulkan: %d\n", jumlah);
                    break;
                default :
                    System.err.println("pilihan tidak valid");
                    stack.print();
                    break;
            }
           
         }while (pilih >= 1 && pilih <= 4);

    }
}
