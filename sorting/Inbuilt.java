//import java.util.Arrays;
//above import are used for only incresing sort
//for decreasing sorting we use
import java.util.Arrays;
import java.util.Collections;
public class Inbuilt{

    public static void InbuiltSort(Integer arr[]){
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int prev=i-1;
            while(prev >=0 && arr[prev]>current){
                arr[prev+1]=arr[prev];
                prev--;

            }
            arr[prev+1]=current;

        }
    }
   

    public static void printArr(Integer arr[]){
        for(Integer i= 0 ; i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
  public static void main(String args[]){
Integer arr[]={5,4,1,3,2 ,21,0};
//Arrays.sort(arr);
//if we want to sort some specific pont then
//Arrays.sort(arr,0,3);
//for decreasing
Arrays.sort(arr , Collections.reverseOrder()); //decresing order sorting
System.out.println("Sorted array are");
printArr(arr);
  }  
}

    

