
public class RevArray {
    public static void Reverse(int numbers[]){
        int first=0;
        int last=numbers.length-1;
        while(first<last){
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;
        
        first++;
        last--;

    }
}
    public static void main (String args[]){
        int numbers[]={21,34,45,76,7};
        Reverse(numbers);
        for(int i=0;i<numbers.length;i++){
           System.out.println(numbers[i]+" "); 
        }
        System.out.println( );
    }
}
