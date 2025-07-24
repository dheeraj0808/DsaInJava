import java.util.*;
public class LinearSearch {

    public static int LinearSearchK(int numbers[],int key){
        for(int i=0; i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }

return -1;

    }
    public static void main (String args[]){
        int numbers[]={12,34,45,46,57,76,4,5};
        int key=57;
        int index = LinearSearchK(numbers,key);
        if(index==-1){
            System.out.print("element are not found");
        } else{
            System.out.print("element are found at " +index +" index");
        }
    }
}
