import java.util.*;
public class Shortest {
    public static float getPath(String path){
        int x=0,y=0;
        for(int i=0;i<path.length();i++){
            char dir=path.charAt(i);
            //south
            if(dir == 'S'){
                y--;
            }
            //north
            if(dir == 'N'){
                y++;
            }
            //west
            if(dir == 'W'){
                x--;
            }
            //east
            if(dir == 'E'){
                x++;
            }
            
        }
        int x2=x*x;
            int y2=y*y;
            return (float)Math.sqrt(x2+y2);


    }
    public static void main(String args[]){
        String path;
        Scanner sc=new Scanner(System.in);
        path=sc.nextLine();
        System.out.println(getPath(path));
    }
}
