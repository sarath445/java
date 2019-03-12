class A{
    public void Car(){
        System.out.println("audi car");
    }
}
class B extends A{
    public void bike(){
        System.out.println("R15");
    }
    
            
}
public class Inheritance{
    public static void main(String[] args) {
        B ob=new B();
        ob.Car();
        ob.bike();
    }
}
    
