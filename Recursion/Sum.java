import java.util.*;
public class Sum{
    public static int sumofn(int n){
        if(n==1){
        return 1;
        }
       int snm1=sumofn(n-1);
       int sn=n+(sumofn(n-1));
       return sn;
        

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("please the the number whose sum till you want to print");
        int n=sc.nextInt();
        System.out.println(" sum of given no are");
     
        System.out.println(   sumofn(n));
    }
    
}