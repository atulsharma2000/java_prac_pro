package abstractionandpolimorphism.interfaceee;
// multiple inheritance of interfaces

interface Pet {
    public void play();
}

interface Item{
    public void itemNumber();
}

public class ImpTest implements Pet,Item {
    
    public void play(){
        System.out.println("playing");
    }

    public void itemNumber(){
        System.out.println("Current Item is 1");
    }



    public static void main(String[] args) {
        ImpTest t = new ImpTest();
        t.play();

        t.itemNumber();
    }
}