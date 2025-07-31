import java.util.Scanner;

public class Spiral{
    
    public static void SpiralP(int matrices[][]){
        int startRow=0;
        int startCol=0;
        int endRow=matrices.length;
        int endCol=matrices.length;
        while ((startRow<=endRow&&startCol<=endCol)) {
            //top
            for(int j=startCol;j<=endCol;j++){
                System.err.println(matrices[startRow][j] +" ");
            
            }
               //right
               for(int i=startRow+1;i<endRow;i++){
                System.err.println(matrices[i][endCol] +" ");

               }
               //bottom
               for(int j=endCol-1;j>=startCol;j--){
                if(startRow==endRow){
                    break;
                }
                System.out.println(matrices[endRow][j] +" ");
               }
               //left
               for(int i=endRow-1;i>=startRow+1;i++){
                if(startCol==endCol){
                    break;
                }
                System.err.println(matrices[i][startCol] +" ");
               }
               startCol++;
               startRow++;
               endCol--;
               endRow--;
        }
        System.err.println();
    }
    public static void main(String args[]){
        int matrices[][]={{1,2,3,4},{5,6,7,8},{8,9,10,11},{12,13,14,15}};
        System.err.println(" now output acording to spiral problem ");
        SpiralP(matrices);
       

    }
    
}