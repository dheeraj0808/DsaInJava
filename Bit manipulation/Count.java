public class Count {
    public static int CountSetBit(int n){
        int count=0;
        while (n>0) {
            if((n&1) !=0){ //lsb
                count++;
            }else{

            }
            n=n>>1;
            
        }
        return count;
    }
    public static void main(String args[]){
        System.out.println(CountSetBit(15));
    }
}
