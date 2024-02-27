public class FinalWord {
    final String name;
    final int age;

    public FinalWord() {
        this.name="aws";
        this.age=5;
    }
    

    @Override
    public String toString() {
        return "FinalWord [name=" + name + ", age=" + age + "]";
    }


    public static void main(String[] args) {
        
        FinalWord obj = new FinalWord();
        System.out.println(obj.toString());

        int r=10;
    }
    
}
