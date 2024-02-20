public class DefaultConstructorStudy {

    float val;
    String color;

    DefaultConstructorStudy(){    //defining default constructor
        val = 10;
        color = "black";
    }


    public static void main(String[] args) {
        System.out.println("learning constructor");

        DefaultConstructorStudy obj = new DefaultConstructorStudy();
        System.out.println(obj.val);
        System.out.println(obj.color);
        obj.val=122;
        obj.a();
        
    }
    public  void a(){
        System.out.println(this.val);
    }
    

}


