import  java.util.Scanner;
public class  SortingMain18{
    public static void main(String[] args) {
        int a[] = {20,10,2,7,12};

        Sorting18 dataurut1 = new Sorting18(a,a.length);
        
        System.out.println("data awal 1");
        dataurut1.tampil();
        dataurut1.bubblesort();
        System.out.println("Data sudah diurutkan dengan BUBBLE SORT (ASC)");
        dataurut1.tampil();
    }
}