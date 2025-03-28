public  class MahasiswaBerprestasi18{
    Mahasiswa18 [] listMHS = new Mahasiswa18[5];
        int idx;

        void tambah (Mahasiswa18 m){
            if (idx<listMHS.length){
                listMHS[idx]=m;
                idx++;
            }else{
                System.out.println("data sudah penuh");
            }
        }

        void tampil(){
            for (Mahasiswa18 m : listMHS){
                m.tampilInformasi();
                System.out.println("------------------------------------------");
            }
        }
        void bubblesort(){
            for (int i = 0; i < listMHS.length - 1; i++){
                for (int j = 1; j < listMHS.length - i; j++) {  
                    if (listMHS[j].ipk > listMHS[j - 1].ipk) {
                        Mahasiswa18 tmp = listMHS[j];
                        listMHS[j] = listMHS[j - 1];
                        listMHS[j - 1] = tmp;
                    }
                }
            }
        }
    }
