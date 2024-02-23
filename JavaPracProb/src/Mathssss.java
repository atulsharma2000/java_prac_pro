public class Mathssss {
    public static void main(String[] args) {
        
        System.err.println(Math.random()); //by default give double eg 0.343434..

        for(int i=0;i<10;i++){
            int rand = (int) (Math.random()*100); //range(0-99)
            System.err.print(rand+"  ");
        }
System.out.println("\n----------------\n");
        for(int i=0;i<10;i++){
            long rand = Math.round((Math.random()*100)); //range(0-99)
            System.err.print(rand+"  ");
        }
    }
}
