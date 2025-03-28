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
        public void bubblesort() {
            for (int i = 0; i < listMHS.length - 1; i++) {
                for (int j = 0; j < listMHS.length - 1 - i; j++) {
                    if (listMHS[j].ipk < listMHS[j + 1].ipk) { 
                        Mahasiswa18 temp = listMHS[j];
                        listMHS[j] = listMHS[j + 1];
                        listMHS[j + 1] = temp;
                    }
                }
            }
        }

        void selectionsort(){
            for (int i=0; i<listMHS.length-1; i++){
                int idxmin=i;
                for (int j=i+1;j<listMHS.length;j++) {
                    if (listMHS[j].ipk<listMHS[idxmin].ipk){
                        idxmin=j;
                    }
                }
                Mahasiswa18 tmp = listMHS[idxmin];
                listMHS[idxmin]=listMHS[i];
                listMHS[i] = tmp;
            }
        }
        void  insertionsort(){
            for(int i=1 ; i<listMHS.length;i++){
                Mahasiswa18 temp= listMHS[i];
                int j=i;
                while (j>0 && listMHS [j-1].ipk>temp.ipk){
                    listMHS[j] = listMHS[j-1];
                    j--;
                } 
                listMHS[j] = temp;
            }
        }
    }