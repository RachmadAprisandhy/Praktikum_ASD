public class DataDosen18 {
    public static void dataSemuaDosen(Dosen18[] daftarDosen) {
        System.out.println("\n===== DATA SEMUA DOSEN =====");
        for (Dosen18 d : daftarDosen) {
            d.tampilkanInfo();
        }
    }

    public static void jumlahDosenPerJenisKelamin(Dosen18[] daftarDosen) {
        int pria = 0, wanita = 0;
        for (Dosen18 d : daftarDosen) {
            if (d.jenisKelamin) {
                pria++;
            } else {
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }

    public static void rerataUsiaDosenPerJenisKelamin(Dosen18[] daftarDosen) {
        int totalPria = 0, totalWanita = 0, brpria = 0, brwanita = 0;
        for (Dosen18 d : daftarDosen) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                brpria++;
            } else {
                totalWanita += d.usia;
                brwanita++;
            }
        }
        double rataPria = (brpria > 0) ? (double) totalPria / brpria : 0;
        double rataWanita = (brwanita > 0) ? (double) totalWanita / brwanita : 0;

        System.out.println("Rata-rata Usia Dosen Pria   : " + rataPria);
        System.out.println("Rata-rata Usia Dosen Wanita : " + rataWanita);
    }

    public static void infoDosenPalingTua(Dosen18[] daftarDosen) {
        Dosen18 tertua = daftarDosen[0];
        for (Dosen18 d : daftarDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }
        System.out.println("\n===== DOSEN PALING TUA =====");
        tertua.tampilkanInfo();
    }

    public static void infoDosenPalingMuda(Dosen18[] daftarDosen) {
        Dosen18 termuda = daftarDosen[0];
        for (Dosen18 d : daftarDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }
        System.out.println("\n===== DOSEN PALING MUDA =====");
        termuda.tampilkanInfo();
    }
}