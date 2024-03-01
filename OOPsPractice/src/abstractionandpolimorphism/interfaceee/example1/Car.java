package abstractionandpolimorphism.interfaceee.example1;

public class Car extends Vehicle{
    private int doors;

    public Car(){
        super(4);    // every constructor has to call ts parent constructor knwon as contructor chaining
    }

    // abstract method defined here
    @Override
    public void makeStartSound(){
        System.out.println("start SOUND....");
    }

    @Override
    public void getSetGo(){
        System.out.println("get set go....");
    }
}
