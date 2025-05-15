public class StackSurat18 {
    Surat18[] stack;
    int top;
    int size;

    public StackSurat18(int size) {
        this.size = size;
        stack = new Surat18[size];
        top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Surat18 surat) {
        if (!isFull()) {
            top++;
            stack[top] = surat;
        } else {
            System.out.println("Stack penuh ! tidak bisa menambahkan surat izin lagi.");
        }
    }

    public Surat18 pop() {
        if (!isEmpty()) {
            Surat18 surat = stack[top];
            top--;
            return surat;
        } else {
            System.out.println("Stack kosong ! tidak ada surat izin untuk diambil.");
            return null;
        }
    }

    public Surat18 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong ! tidak ada surat izin yang dikumpulkan.");
            return null;
        }
    }

    public void terimaSurat() {
        for (int i = 0; i <= top; i++) {
            stack[i].tampilkanSurat();
        }
    }

    public void prosesSurat() {
        Surat18 surat = pop();
        if (surat != null) {
            System.out.println("Memproses surat izin berikut:");
            surat.tampilkanSurat();
        }
    }


    public void lihatSuratTerakhir() {
        Surat18 surat = peek();
        if (surat != null) {
            System.out.println("Surat izin terakhir:");
            surat.tampilkanSurat();
        }
    }

   
    public void cariSurat(String namaMahasiswa) {
        boolean ditemukan = false;
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(namaMahasiswa)) {
                System.out.println("Surat ditemukan:");
                stack[i].tampilkanSurat();
                ditemukan = true;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat dengan nama mahasiswa '" + namaMahasiswa + "' tidak ditemukan.");
        }
    }
}
