 //in febonacci series every next number is sum of previous two number 
    //and first two febonacci numbers are already given which is 0,1
    //febonacci series will be 0,1,1,2,3,5,8,13,21,34,55,......
    //so inthis problem we have to find the febonacci series code with the help of recursion
import java.util.*;
public class Febonacci {
   
    public static int fib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fbn1=fib(n-1);
        int fbn2=fib(n-2);
        int fn= fbn1+fbn2;
        return fn;

    }
    
    public static void main(String args[]) {
        //Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        int n=5;
        //Scanner sc=new Scanner(System.in);
        //int arr[]=sc.nextLine();


        //System.out.println(fib(n));
        System.out.println(fib(15));
        
        System.out.println(fib(16));
        System.out.println(fib(17));
        System.out.println(fib(18));
        System.out.println(fib(19));
        System.out.println(fib(20));
        System.out.println(fib(25));
    }
    
}
