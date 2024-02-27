import inheritance.Vehicle;

public class TestVhicleProtected extends Vehicle{
    
    public static void main(String[] args) {
        TestVhicleProtected obj = new TestVhicleProtected();
        obj.dob=3;  // dob is protected memeber of superclass
    }
   
    
}
