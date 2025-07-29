import java.util.*;
public class CountingSort {
    public static void Count(int arr[]){
        //for range ki kitna maximum jayega
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest, arr[i]);
        }
        //largest + 1 used because we start from zero 
        int count[]=new int[largest+1];
        //we are counting here about array
        //aur yaha hum orignal array par kaam kar rhe hai
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        //aur yaha hum frequency wali array par kaam kar rhe hai
        for(int i=0;i<count.length;i++){
            while (count[i]>0) {
                arr[j]=i;
                j++;
                count[i]--;
                
            }
        }

    }
    public static void printArr(int arr[]){
        for(int i= 0 ; i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={4,5,2,5,1,2,1};
        Count(arr);
        System.out.println("Sorted array are ");
        printArr(arr);
       
    }
    
}
