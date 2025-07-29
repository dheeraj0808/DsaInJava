public class Polymorphism {
    public static void main(String[] args) {
        Calculator calc=new Calculator();
        System.out.println(calc.Sum(4, 2));
        System.out.println(calc.Sum((float)1.2,(float)1.9));
        System.out.println(calc.Sum(2,4,5));
        
    }
    
}
class Calculator{
    int Sum(int a ,int b){
        return a+b;
    }
    int Sum(int a ,int b,int c){
        return a+b+c;
    }
    float Sum(float a ,float b){
        return a+b;
    }
}
