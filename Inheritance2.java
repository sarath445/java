class A{
    public void Car(){
        System.out.println("audi car");
    }
}
class B extends A{
    public void Bike(){
        System.out.println("r15");

    }
}
class C extends B{
    public void Cycle(){
        System.out.println("ladybird");
    }
}
public class Inheritance2{
    public static void main(String[] args) {
        C ob=new C();
        ob.Bike();
        ob.Cycle();
    }
}