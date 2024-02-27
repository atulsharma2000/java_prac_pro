package inheritance;

public class Vehicle {
    public int numOfTires;
    private int regNum;

    protected int dob; //using protected can access by subclass which is present in other package as well

    public void setRegNum(int regNum) {
        this.regNum = regNum;
    }

    public void commute(){
        System.out.println("Going a to b using tyres = "+numOfTires);
    }


    
}
