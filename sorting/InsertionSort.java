public class InsertionSort{
    public static void Insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int current=arr[i];
            int prev=i-1;
            while(prev >=0 && arr[prev]>current){
                arr[prev+1]=arr[prev];
                prev--;

            }
            arr[prev+1]=current;

        }

    }
    public static void printArr(int arr[]){
        for(int i= 0 ; i<arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={4,5,2,7,9,1};
        Insertion(arr);
        System.out.println("Sorted array are ");
        printArr(arr);
       
    }
}