public class MehtodOverriding {
   public static void main(String[] args) {
    Horse rocky =new Horse();
    rocky.eat();
    
   } 
}
class Animal{
    String color;
    void breathe(){
        System.out.println("breathe");
    }
    void eat(){
        System.out.println("eats");
    }
}
class Horse extends Animal{
    void eat(){
        System.out.println("everthing");
    }
}