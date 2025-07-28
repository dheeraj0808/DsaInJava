import java.util.Scanner;
public class Substring {
    public static String SubStrings2(String str,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);

        }
        return substr;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        System.out.println(SubStrings2(str,1,5));
    }
    
}
