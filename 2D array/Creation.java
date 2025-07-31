import java.util.Scanner;

public class Creation{
    public static boolean Search(int matrices[][],int key){
        for(int i=0;i<matrices.length;i++){
            for(int j=0;j<matrices[0].length;j++){
               if(matrices[i][j]==key){
                System.out.println("elemnt found at " + i+" , " +j);
                return true;
               }
            }
            
        }
        System.out.println("key not found");
        return false;

    }
    public static void main(String args[],int key){
        int matrices[][]=new int[3][3];
        int n=matrices.length;
        int m=matrices[0].length;
        System.out.println("enter the arrays element");
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrices[i][j]=sc.nextInt();
                
            }
        }
        Search(matrices, key);
       

    }
    
}