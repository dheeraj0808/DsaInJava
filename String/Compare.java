public class Compare {
   public static void main(String[] args) {
    String s1="Rahul";
    String s2="Rahul";
    String s3=new String("Rahul");
   /*  if(s1==s2){
        System.out.println("numbers are equal");
    }else{
        System.out.println("numbers are not equal");
    }
    if(s1==s3){
        System.out.println("numbers are equal");
    }else{
        System.out.println("numbers are not equal");
    }
   }*/
   //(==) wale case me ham value ko compare nahi karte hai 
   //value compare karne ke liye ham .equals ka use karenge jisse ki exact ans aaye
   if(s1.equals(s2)){
    System.out.println("numbers are equal");
}else{
    System.out.println("numbers are not equal");
}
if(s1.equals(s3)){
    System.out.println("numbers are equal");
}else{
    System.out.println("numbers are not equal");
}
}

    
}
