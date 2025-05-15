public class  StackKonversi18 {
    int [] tumpukanBiner;
    int top;
    int size;

    public StackKonversi18(int size) {
        this.size = size = 32;
        tumpukanBiner = new int[size];
        top = -1;
    }
    public boolean isEmpty(){
        return top == -1;
    }
    public boolean isFull(){
        return top == size - 1;
    }
    public void push(int data) {
        if (!isFull()) {
            top++;
            tumpukanBiner[top] = data;
        } else {
            System.out.println("Stack penuh");
        }
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong ! tidak ada tugas untuk dinilai.");
            return -1;
        } else {
            int data = tumpukanBiner[top];
            top--;
            return data;
        }
    }
}