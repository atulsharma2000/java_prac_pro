public class Car {

   int noOfWheels;
   String color;
   float curretnFuelInLiters;
   int noOfSeats;

   public void drive(){

        if(curretnFuelInLiters<=0)
            System.err.println("Car out of fuel");
        else if(curretnFuelInLiters<5)
            System.err.println("Car in reserved mode, Refuel now !!");
        else{
            System.out.println("......Car is Driving........");
            curretnFuelInLiters--;
        }
   }

   public void addFuel(float fuel){
        curretnFuelInLiters +=fuel;
   }
   
   public float getCurrentFuelLevel(){
        return curretnFuelInLiters;
   }
   
   
}
