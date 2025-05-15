

public  class StackTugasMahasiswa18 {
    Mahasiswa18[] stack;
    int top;
    int Size;

    public StackTugasMahasiswa18(int size) {
       this.Size = size;
        stack = new Mahasiswa18[size];
        top = -1;
    }

    public boolean isFull(){
        if (top == Size - 1) {
            return true;
        } else {
            return false;
        }
    }
    public boolean isEmpty(){
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa18 mhs) {
    
    if (!isFull()) {
        top++;
        stack[top] = mhs;
    } else {
        System.out.println("Stack penuh ! tidak bisa menambahkan tugas lagi.");
    }
}
public Mahasiswa18 pop() {
    if (!isEmpty()) {
        Mahasiswa18 mhs = stack[top];
        top--;
        return mhs;
    } else {
        System.out.println("Stack kosong ! tidak ada tugas untuk dinilai.");
        return null;
    }
}
public Mahasiswa18 peek() {
    if (!isEmpty()) {
        return stack[top];
    } else {
        System.out.println("Stack kosong ! tidak ada tugas yang dikumpulkan.");
        return null;
    }

}void print () {
    for (int i = 0; i<= top; i++){
        System.out.println(stack[i].nama + "\t" + stack[i].NIM + "\t" + stack[i].kelas);
    }
    System.err.println("");
    }

public Mahasiswa18 palingbawah() {
    if (!isEmpty()) {
        return stack[0];
    } else {
        System.out.println("Stack kosong! Tidak ada tugas.");
        return null;
    }
}
public int jumlahTugas() {
    return top + 1; 
}

public String KonversiDesimalKeBinner (int nilai){
    StackKonversi18 stackBiner = new StackKonversi18(32); 
    while (nilai > 0) {
        int sisa = nilai % 2;
        stackBiner.push(sisa);
        nilai = nilai / 2;
    }
    String biner = new String();
    while (!stackBiner.isEmpty()) {
        biner += stackBiner.pop();
    }
    return biner;
}
}