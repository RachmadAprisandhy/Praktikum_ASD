import  java.util.Scanner;
public class  SortingMain18{
    public static void main(String[] args) {
        int a[] = {20,10,2,7,12};
        int b[] = {30, 20, 2, 8, 14};
        int c[] = {40 , 10 , 4 , 9 , 3};

        Sorting18 dataurut1 = new Sorting18(a,a.length);
        Sorting18 dataurut2 = new Sorting18(b,b.length);
        Sorting18 dataurut3 = new Sorting18(c,c.length);
        
        System.out.println("data awal 1");
        dataurut1.tampil();
        dataurut1.bubblesort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();

        System.out.println("data awal 2");
        dataurut2.tampil();
        dataurut2.bubblesort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut2.tampil();

        System.out.println("data awal 3");
        dataurut3.tampil();
        dataurut3.insertionSort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut3.tampil();
    }
}