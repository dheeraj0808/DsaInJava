import java.util.*;
public class Largest {
    public static int getLargest(int numbers[]){
       int Largest=Integer.MIN_VALUE; //it shows -infinity
       int Smallest=Integer.MAX_VALUE;
     for(int i=0;i<numbers.length;i++){
        if(Smallest>numbers[i]){
            //Largest=numbers[i];
            Smallest=numbers[i];
        }
     }
      //return Largest;
      return Smallest;

    }

    public static void main (String args[]){
        int numbers[]={12,314,45,56,67,78,98,122,13,355};
        System.out.println("largest no is "+getLargest(numbers));


    }

}
