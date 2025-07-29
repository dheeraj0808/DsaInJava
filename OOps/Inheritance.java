public class Inheritance{
    public static void main(String[] args) {
       /*  Fish shark=new Fish();
        shark.eat();
        shark.swim();*/
       /* */ Dog dobby=new Dog();
        dobby.eat();
        dobby.legs=4;
        System.out.println(dobby.legs);

        
    }
    
}
class Animal{
    String color;
    void eat(){
        System.out.println(" eats");
    }
    void breathe(){
        System.out.println(" breathes");
    }
}
//single
//class Fish extends Animal{
  //  int fins;
    //void swim(){
      //  System.out.println("swims");
   // }
//}
// multi levele inheritance
class Mammal extends Animal{
    int legs;
    

}
class Dog extends Mammal{
    String bread;
    void walk(){
        System.out.println("yes ");
    }

}