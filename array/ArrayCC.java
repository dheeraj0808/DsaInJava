import java.util.*;
public class ArrayCC {
    public static int getSmallest(int numbers[]){
        int smallest =Integer.MAX_VALUE;
        for (int i=0;i<numbers.length;i++){
            if(smallest>numbers[i]){
                smallest=numbers[i];
            }
        }
        return smallest;
    
    }

    public static void main (String args[]){
int numbers[]= {21,32,34,45};
System.out.println("smallest value is "+getSmallest(numbers));

    }
}

