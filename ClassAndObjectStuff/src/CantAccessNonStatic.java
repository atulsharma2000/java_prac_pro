
// code to see errors

public  class CantAccessNonStatic {
    String name= "awesome";
    static int minAge =10;
    int gg;
    int h=9;
    public static void main(String[] args) {

        CantAccessNonStatic obj = new CantAccessNonStatic();
        
        // gg=10;   ERROR
        // see the error on name
        // Cannot make a static reference to the non-static field


        //  to access it we use obj of class
        obj.gg=10;

        // System.out.println(h);
        // CantAccessNonStatic.awesome();
        

        obj.h=55;
        obj.awesome(obj);
        minAge=11;
        obj.minAge=12;
        obj.awesome(obj);
    }

    public void awesome(CantAccessNonStatic obj ){
        System.out.println(minAge);        
        System.out.println(h); 
        // System.out.println(sec); error
        
    System.err.println(name);
    }

}