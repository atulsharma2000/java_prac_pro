

// exnteds object is also by default added at compile time if no extending class written
public class TryObjectClass extends Object {
     public static void main(String[] args) {
        

        TryObjectClass obj = new TryObjectClass();

        System.out.println(obj.toString());
        System.out.println(obj.hashCode());  // in base 10
        System.out.println(obj.equals(obj));
        System.out.println(obj.getClass());
        // obj.wait();
        // obj.clone();
        // obj.finalize();
        // obj.notify();
        // obj.notifyAll();
        
}
