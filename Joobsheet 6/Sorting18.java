

public class Sorting18{
    int [] data ;
    int jumData;


    Sorting18 (int Data[], int JmlhData){
        jumData = JmlhData;
        data= new int[JmlhData];
        for  (int i=0; i<jumData;i++){
            data[i]= Data [i];
        }
    }
    void  bubblesort(){
        int temp=0;
        for (int i=0; i<jumData-1;i++){
            for(int j=1; j< jumData-i;j++){
                if (data[j-1]> data[j]){
                    temp=data[j];
                    data[j]=data[j-1];
                    data[j-1]=temp;
                }
            }
        }
    }
    void selectionsort(){
        for (int i=0; i< jumData; i++){
         int min=i;
         for (int j=i+1; j<jumData; j++){
             if (data[j] < data [min]){
                 min=j;
             }
         }
         int temp=data[i];
         data[i]=data[min];
         data[min]=temp;
        }
     }
    void  tampil(){
        for(int i=0; i<jumData;i++){
            System.out.print(data[i] + "");
        }
        System.out.println();
    }
}
