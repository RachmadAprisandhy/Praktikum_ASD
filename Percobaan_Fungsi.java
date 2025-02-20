import java.util.Scanner;

public class Percobaan_Fungsi {
    
    static int HARGA_AGLONEMA = 75000;
    static int HARGA_KELADI = 50000;
    static int HARGA_ALOCASIA = 60000;
    static int HARGA_MAWAR = 10000;

    public static void main(String[] args) {
        Scanner scanner18 = new Scanner(System.in);

        String[] dataToko = {"RoyalGarden 1", "RoyalGarden 2", "RoyalGarden 3", "RoyalGarden 4"};

        int[][] stok = {
            {10, 5, 15, 7},  
            {6, 11, 9, 12},  
            {2, 10, 10, 5},  
            {5, 7, 12, 9}    
        };

        int pilihan;
        do {
            System.out.println("\n===== SELAMAT DATANG DI HALAMAN ADMIN ROYAL GARDEN =====");
            System.out.println("Pilih menu yang anda inginkan:");
            System.out.println("1. Tampilkan data pendapatan");
            System.out.println("2. Tampilkan stok tiap cabang");
            System.out.println("3. Tampilkan stok setelah pengurangan di RoyalGarden 4");
            System.out.println("4. Keluar");
            System.out.print("Pilihan Anda: ");

            pilihan = scanner18.nextInt();
            scanner18.nextLine(); 

            switch (pilihan) {
                case 1:
                    tampilkanPendapatan(dataToko, stok);
                    break;
                case 2:
                    tampilkanStok(dataToko, stok);
                    break;
                case 3:
                    tampilkanStokRoyalGarden4SetelahPengurangan(stok);
                    break;
                case 4:
                    System.out.println("Keluar dari menu");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
            }
        } while (pilihan != 4);

        scanner18.close();
    }

    public static void tampilkanStok(String[] cabang, int[][] stok) {
        System.out.println("\nStok setiap cabang:");
        for (int i = 0; i < stok.length; i++) {
            System.out.println(cabang[i] + " = Aglonema: " + stok[i][0] +
                               ", Keladi: " + stok[i][1] +
                               ", Alocasia: " + stok[i][2] +
                               ", Mawar: " + stok[i][3]);
        }
    }

    public static void tampilkanPendapatan(String[] cabang, int[][] stok) {
        System.out.println("\nPendapatan jika semua bunga terjual:");
        for (int i = 0; i < stok.length; i++) {
            int pendapatan = (stok[i][0] * HARGA_AGLONEMA) +
                             (stok[i][1] * HARGA_KELADI) +
                             (stok[i][2] * HARGA_ALOCASIA) +
                             (stok[i][3] * HARGA_MAWAR);
            System.out.println(cabang[i] + ": Rp " + pendapatan);
        }
    }

    public static void tampilkanStokRoyalGarden4SetelahPengurangan(int[][] stok) {
        int[] pengurangan = {-1, -2, 0, -5}; 
        
        int aglonema = stok[3][0] + pengurangan[0];
        int keladi = stok[3][1] + pengurangan[1];
        int alocasia = stok[3][2] + pengurangan[2];
        int mawar = stok[3][3] + pengurangan[3];

        System.out.println("\nStok Royal Garden 4 setelah pengurangan:");
        System.out.println("Aglonema: " + aglonema);
        System.out.println("Keladi: " + keladi);
        System.out.println("Alocasia: " + alocasia);
        System.out.println("Mawar: " + mawar);
    }
}
