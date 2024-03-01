package abstractionandpolimorphism.abstractionprac;

// abstract class cant have objects, it can only be inherited
public abstract class Vehicle {
    private int tyres;

    public Vehicle(int tyres) {
        this.tyres = tyres;
    }

    public int getTyres() {
        return tyres;
    }

    public void setTyres(int tyres) {
        this.tyres = tyres;
    }

    public void commute(){
        System.out.println("moving.....");
    }
}
