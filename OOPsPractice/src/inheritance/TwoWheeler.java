package inheritance;

public class TwoWheeler extends Vehicle{
    
    TwoWheeler(){
        numOfTires=2;
        setRegNum(12345); //setter of regNum
    }

    public void balance(){

        System.out.println("2 tyre balance");
    }
}
