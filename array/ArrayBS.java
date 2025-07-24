import java.util.*;
public class ArrayBS {
    public static int binarySearch(int numbers[],int key){
        int start=0;
        int end=numbers.length-1;
        while(start<=end){
            int mid = (start + end)/2;
            if(numbers[mid]==key){
                return mid;
            }
            if(numbers[mid]<key){
                start=mid+1;
            }else{
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={3,12,34,45,56,76,87};
        int key=3;
        int index= binarySearch(numbers, key);
        if(index==-1){
            System.out.println("numbers are not found in the list");
        }else{
            System.out.println("element are at the index "+binarySearch(numbers, key));
        }
      
    }
}