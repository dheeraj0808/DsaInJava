import java.util.*;
public class Evenodd {
    public static void EvenOrOdd(int n){
        int bitmask=1;
        if((n & bitmask)==0){
            System.out.println("number is even");

        }else{
            System.out.println("number is odd");
        }
    }
    public static void main(String args[]){
        System.out.println("enter the element");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        EvenOrOdd(n);
    }
}
