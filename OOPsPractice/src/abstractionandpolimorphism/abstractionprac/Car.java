package abstractionandpolimorphism.abstractionprac;

public class Car extends Vehicle{
    private int doors;

    public Car(){
        super(4);    // every constructor has to call ts parent constructor knwon as contructor chaining
    }
}
