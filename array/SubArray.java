
public class SubArray {
    public static void PrintSubArray(int numbers[]){
        int curr=0;
        for(int i=0; i<numbers.length; i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k] +" ");
                    curr+=numbers[k];
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("sum of sub array" +curr);
        }
       

    }
    public static void main(String args[]){
        int numbers[]={12,-4,6,-8,9,1};
        PrintSubArray(numbers);
    }
    
}
