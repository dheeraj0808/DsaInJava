public class ReverseRecursion{
    public static void PrintDec(int n){
        if(n==1){
            System.out.print(1);
            return;
        }{
            System.out.print(n+" ");
            PrintDec(n-1);
        }
    }
    public static void PrintInc(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        PrintInc(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println("the increasing number are");
        PrintInc(n);
    }

}