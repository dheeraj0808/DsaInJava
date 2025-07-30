public class LastOcc {
    public static int LastOccurePrint(int arr[],int n,int i){
        if(i==arr.length){
            return -1;
        }
       int isFound=LastOccurePrint(arr, n, i+1);
       if(isFound!=-1){
        return isFound;
       }
       if(arr[i]==n){
        return i;
       }
       return isFound;


    }
    public static void main(String[] args) {
        int n;
        int arr[]={8,5,4,6,2,5,7,0,2,1,5,5,2,3};
        System.out.println(LastOccurePrint(arr, 2, 0));
    }
    
}
