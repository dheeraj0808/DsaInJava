public class HierachialInheritance {
    public static void main(String[] args) {
        Fish shark=new Fish();
        shark.swim();
        Mammal human=new Mammal();
        human.legs=4;
        System.out.println(human.legs);
        human.eat();
        Bird gauraya=new Bird();
        gauraya.fly();
        
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
class Mammal extends Animal{
    int legs;
    void walk(){
        System.out.println("yes they can walk");
    }
}
class Fish extends Animal{
    
    void swim(){
        System.out.println("yes they can swim");
    }
}
class Bird extends Animal{
    int legs;
    void fly(){
        System.out.println("yes they can fly");
    }
}