package in.gettersetter;

public class Car {
    private String color;  // but we want its public access 
    private String model; // but we want its public access 
    private double fuelLevel;
    private long costOfPurchase;  // waant its default access

    public Car(){

    }

    public Car(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    // getters
    public  String getColor(){
        return color;
    }
    public  String getModel(){
        return model;
    }

    //setters
    public void setColor(String color){
        if(color.equals("pink"))
            System.out.println("pink color ?? pagal hai kya");
        else
         this.color=color;
    }

}
