public class PowerXtoN {
  /*   public static int power(int x , int n){
        if(n==0){
            return 1;
        }
        return x*power(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println(power(2, 10));

    }*/

//with the optimized way of code to find the power of x^n
// time complexity of optimized version is o(log n)
public static int optimizedPower(int a , int n){
    if(n==0){
        return 1;
    }
    int halfPowerSq=optimizedPower(a , n/2) * optimizedPower(a , n/2);
    //n is odd
    if(n%2 !=0){
        halfPowerSq= a * halfPowerSq;
    }
    
    
    return halfPowerSq;
}
public static void main(String[] args) {
    int  a =2;
    int n=10;
    System.out.println(optimizedPower(a,n));
}
}