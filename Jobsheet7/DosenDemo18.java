public class DosenDemo18 {
    DataDosen18 [] listDSN;
    int jumlahData;

    public DosenDemo18(int kapasitas) {
        listDSN = new DataDosen18[kapasitas];
        jumlahData = 0;
    }

    public void tambah(DataDosen18 d) {
        if (jumlahData < listDSN.length) {
            listDSN[jumlahData] = d;
            jumlahData++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    public void tampil() {
        if (jumlahData == 0) {
            System.out.println("Belum ada data dosen.");
        } else {
            for (int i = 0; i < jumlahData; i++) {
                listDSN[i].tampilInformasi();
            }
        }
    }

    public void bubblesort() {
        for (int i = 0; i < jumlahData - 1; i++) {
            for (int j = 0; j < jumlahData - 1 - i; j++) {
                if (listDSN[j].usia > listDSN[j + 1].usia) {
                    DataDosen18 temp = listDSN[j];
                    listDSN[j] = listDSN[j + 1];
                    listDSN[j + 1] = temp;
                }
            }
        }
    }

    public void selectionsort() {
        for (int i = 0; i < jumlahData - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < jumlahData; j++) {
                if (listDSN[j].usia > listDSN[maxIndex].usia) {
                    maxIndex = j;
                }
            }
            DataDosen18 temp = listDSN[maxIndex];
            listDSN[maxIndex] = listDSN[i];
            listDSN[i] = temp;
        }
    }

    public void insertionsort() {
        for (int i = 1; i < jumlahData; i++) {
            DataDosen18 temp = listDSN[i];
            int j = i;
            while (j > 0 && listDSN[j - 1].usia < temp.usia) {
                listDSN[j] = listDSN[j - 1];
                j--;
            }
            listDSN[j] = temp;
        }
    }

    public void SequentialSearch18 (String namaDicari) {
        boolean ditemukan = false;
        int jumlahDitemukan = 0;
    
        for (int i = 0; i < jumlahData; i++) {
            if (listDSN[i].nama.equalsIgnoreCase(namaDicari)) {
                listDSN[i].tampilInformasi();
                ditemukan = true;
                jumlahDitemukan++;
            }
        }
    
        if (!ditemukan) {
            System.out.println("Data dosen dengan nama '" + namaDicari + "' tidak ditemukan.");
        } else if (jumlahDitemukan > 1) {
            System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan nama '" + namaDicari + "'.");
        }
    }
    
    public void BinarySearch18(int usiaDicari) {
        bubblesort(); 
        int kiri = 0;
        int kanan = jumlahData - 1;
        boolean ditemukan = false;
    
        int tengah;
        while (kiri <= kanan) {
            tengah = (kiri + kanan) / 2;
            if (listDSN[tengah].usia == usiaDicari) {
                int i = tengah;
                int jumlahDitemukan = 0;
    
                while (i >= 0 && listDSN[i].usia == usiaDicari) {
                    i--;
                }
                i++;
    
                while (i < jumlahData && listDSN[i].usia == usiaDicari) {
                    listDSN[i].tampilInformasi();
                    i++;
                    jumlahDitemukan++;
                }
    
                if (jumlahDitemukan > 1) {
                    System.out.println("Peringatan: Ditemukan lebih dari satu dosen dengan usia " + usiaDicari + ".");
                }
    
                ditemukan = true;
                break;
            } else if (listDSN[tengah].usia < usiaDicari) {
                kiri = tengah + 1;
            } else {
                kanan = tengah - 1;
            }
        }
    
        if (!ditemukan) {
            System.out.println("Data dosen dengan usia " + usiaDicari + " tidak ditemukan.");
        }
    }
}