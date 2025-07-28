import java.util.*;
public class largest {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String fruit[]={"banana","fish","mango"};
        String large=fruit[0];
        for(int i=0;i<fruit.length;i++){
            if(large.compareTo(fruit[i])<0){
                large=fruit[i];
            }

        }
        System.out.println(large);

    }

    
}
