public class AbstractClasses {
    public static void main(String[] args) {
      // Chicken c2=new Chicken();
     //  c2.eat();
     //  Cat c3=new Cat();
      // c2.eat();
       //c3.walk();
       //c2.walk();
       //System.out.println(c2.color);
       Billu b =new Billu();
    }
    
}
abstract class Animals{
    //constructor in abstract classes
    String color;
    Animals(){
        color="brown";
        System.out.println("animal constructor is callled here so be careful while coding and take care about the smalll mistakes and small error ");
    }
    void eat(){
        System.out.println("animal eats");
    }
    abstract void walk();
    }
    class Chicken extends Animals{
        void ChangeColor(){
            color="white";
        }
        void walk(){
            System.out.println("walk on 4 legs");
        }
    }
    
    class Cat extends Animals{
        Cat(){
            System.out.println("constructor of cat class");
        }
        void ChangeColor(){
color="black";
        }
        void walk(){
            System.out.println("ya human can walk on two legs");
        }
    }
    class Billu extends Cat{
        Billu(){
            System.out.println("billuu constructor is here ");
        }
    }

