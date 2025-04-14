public class MahasiswaBerprestasi18{
        Mahasiswa18[] listMahasiswa;
        int idx;
    
        public MahasiswaBerprestasi18(int jumlah) {
            listMahasiswa = new Mahasiswa18[jumlah];
            idx = 0;
        }

    void tampil() {
        for (int i = 0; i < idx; i++) {
            listMahasiswa[i].TampilInformasi();
        }
    }

    public void Tambah(Mahasiswa18 mhs){
        if (idx < listMahasiswa.length){
            listMahasiswa[idx] = mhs;
            idx++;
        }else{
            System.out.println("kapasitas penuh");
        }
    }

    public int sequentialSearching(double cari){
        int posisi = -1;
        for(int j=0; j<listMahasiswa.length;j++){
            if (listMahasiswa[j].ipk==cari){
                posisi =j;
                break;
            }
        }
        return  posisi;
    }

    void tampilposisi(double x, int pos){
        if (pos!=-1){
            System.out.println("data mahasiswa dengan IPK : " + x + "ditemukan pada indeks  : " + pos);
        }else{
            System.out.println("data : " + x + "tidak ditemukan");
        }
    }

    void  tampilDataSearch(double  x, int pos){
        if(pos !=-1){
            System.out.println("nim\t : " + listMahasiswa[pos].Nim);
            System.out.println("nama\t : " + listMahasiswa[pos].Nama);
            System.out.println("kelas\t : " + listMahasiswa[pos].Kelas);
            System.out.println("ipk\t : " + x);
        }else{
            System.out.println("Data mahasiswa dengan IPK : " + x + "tidak ditemukan");
        }
    }

    public int findBinarrySearch(double cari,int left , int right){
        int mid;
        if(right>=left){
            mid = (left+right)/2;
            if (cari == listMahasiswa[mid].ipk){
                return (mid);
            }else if(listMahasiswa[mid].ipk<cari){
                return findBinarrySearch(cari, left, mid -1);
            }else{
                return findBinarrySearch(cari, mid+1, right);
            }
        }
        return  -1;
    }
}