public class FirstOcc {
    public static int FindFirstOccurence(int arr[],int n,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==n){
            return i;
        }
        return FindFirstOccurence(arr, n, i+1);

    }
    public static void main(String[] args) {
        int n=5;
        int arr[]={2,4,6,2,5,7,0,2,1,5,8};
        System.out.println(FindFirstOccurence(arr, 5, 5));
    }
    
}
