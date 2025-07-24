
public class Pairs{
    public static void PrintPairs(int numbers[]){
        int tp=0;
        for(int i=0;i<numbers.length;i++){
            int curr=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("(" +curr +"," + numbers[j] +")");
                tp++;
            }
            System.out.println();
        }
        System.out.println("total pairs : "+tp);

    }
    public static void main(String args[]){

        int numbers[]={12,34,45,46,13,56};
        PrintPairs(numbers);
    }
}