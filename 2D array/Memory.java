import java.util.*;
public class Memory {
    public static void Spiral(int matrices[][]){
      
    }
   
    public static void main(String args[]){
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

    }
    
}
