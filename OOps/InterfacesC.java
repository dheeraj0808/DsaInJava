public class InterfacesC{
    public static void main(String[] args) {
        Bear b=new Bear();
        b.eat();
        b.sleep();
        
    }
    
}
interface Herbivore{
     void eat();

}
interface Carnivore{
    public void sleep();

}
class Bear implements Herbivore,Carnivore{
    public void eat(){
        System.out.println("eat grass and all thing  ");
    }
    public void sleep(){
        System.out.println("sleep on tree");
    }

}