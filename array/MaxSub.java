
public class MaxSub {
    public static void MaxSubArray(int numbers[]){
        int CurrentSum=0;
        int MaxSum=Integer.MIN_VALUE;
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                CurrentSum=0;
                for(int k=start;k<=end;k++){
                    CurrentSum+=numbers[k];
                }
                System.out.print(CurrentSum);
                if(MaxSum<CurrentSum){
                    MaxSum=CurrentSum;
                }
            }
            
        }
        System.out.println("max sum = "+MaxSum);

    }
    public static void main(String args[]){
        int numbers[]={2,-3,4,-5,6,-1,6,9};
        MaxSubArray(numbers);
    }
    
}
