public class Car {

   int noOfWheels;
   String color;
   float curretnFuelInLiters;
   int noOfSeats;

   public Car start(){
    if(curretnFuelInLiters<=0)
        System.err.println("Car out of fuel, can't start");
    else if(curretnFuelInLiters<5){
        System.err.println("Car Started in reserved mode, Refuel now !!");     
    }
    else{
        System.out.println("Car is started........");
    }
    return this;   //returning current objects adderess of class Car
   }

   public void drive(){
        System.out.println("......Car is Driving........");
        curretnFuelInLiters--; 
   }

   public void addFuel(float curretnFuelInLiters){
        this.curretnFuelInLiters += curretnFuelInLiters;
        // we could have given different name to local valriable but for understanding
        // intially this.curretnFuelInLiters = 0 ,  then we add float argument curretnFuelInLiters here.
        // using "this", we are making sure that current objects curretnFuelInLiters gets the added value from local variable curretnFuelInLiters
   }
   
   public float getCurrentFuelLevel(){
        return curretnFuelInLiters;
   }
   


  
}
