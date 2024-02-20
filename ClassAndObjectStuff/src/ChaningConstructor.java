public class ChaningConstructor {
    
    int val;
    String color;
    String name;
    float speed;

    ChaningConstructor(String clr){
        val = 4;
        this.color = clr;
        name = "Dream";
        speed = 10;
    }

    ChaningConstructor(){           // providing color if not provided by the user
        this("black");
    }
}
