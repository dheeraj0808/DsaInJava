import java.util.*;
//convert to uppercase of a given string ony the first letter of every word
public class Upper {
    public static String toUpperCase(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '&&i<str.length()){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }else{
                sb.append(str.charAt(i));
            }

        }
        return sb.toString();


    }
    public static void main(String args []) {
      
        String str="my name is dheeraj singh";
        System.out.println(toUpperCase(str));
        
    }
    
}
