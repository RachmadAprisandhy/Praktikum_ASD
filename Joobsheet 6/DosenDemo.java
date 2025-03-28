public class DosenDemo {
    DataDosen[] listDSN;
    int jumlahData;

    public DosenDemo(int kapasitas) {
        listDSN = new DataDosen[kapasitas];
        jumlahData = 0;
    }

    public void tambah(DataDosen d) {
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
                    DataDosen temp = listDSN[j];
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
            DataDosen temp = listDSN[maxIndex];
            listDSN[maxIndex] = listDSN[i];
            listDSN[i] = temp;
        }
    }

    public void insertionsort() {
        for (int i = 1; i < jumlahData; i++) {
            DataDosen temp = listDSN[i];
            int j = i;
            while (j > 0 && listDSN[j - 1].usia < temp.usia) {
                listDSN[j] = listDSN[j - 1];
                j--;
            }
            listDSN[j] = temp;
        }
    }
}