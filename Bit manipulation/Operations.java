import java.util.*;
public class Operations {

    //Get ith bit
   public static int GetIthBit(int n, int i){
    int bitmask=(1<<2);
    if((n&bitmask)==0){
        return 0;
    }else{
        return 1;
    }

   }
   //set ith bit
   public static int SetIthBit(int n,int i){
    int bitmask=(1<<i);
    return n|bitmask;
   }
   //clear ith bit
   public static int ClearIthBit(int n, int i){
    int bitmask = ~(1<<i);
    return n & bitmask;

   }
   //update ith bit
   public static int UpdateIthBit(int n,int i,int newBit){
    n=ClearIthBit(n, i);
    int Bitmask= newBit<<i;
    return n|Bitmask;

   }
   //clear ith bit
   public static int ClearLastIthBit(int n,int i){
    int bitMask=(~0)<<i;
    return n & bitMask;
   }
   //clear in range
   public static int ClearInRange(int n, int i, int j){
    int a=(~0)<<(j+1);
    int b=(1<<i)-1;
    int bitMask=a|b;
    return n & bitMask;
   }
   //power check karne ke liye ki 2 ka hai ya nhi
   public static boolean Powerof2(int n){
    return (n & (n-1)) == 0;
   }

   
   public static void main(String[] args) {
    System.out.println(Powerof2(16));
   }
}
