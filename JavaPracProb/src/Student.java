import java.util.Scanner;

public class Student {
    String name;
    int age;

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    public static void main(String[] args) {

        System.err.println("\nchallenge 1");
        Student obj = new Student();
        System.out.println(obj.toString());


        System.err.println("\n\nchallenge 2");
        String str1 = "Atul";
        String str2 =" Sharma";
        System.out.printf("%S\n",str1+str2);
        System.out.println((str1.concat(str2)).toUpperCase());


        System.err.println("\n\nchallenge 3 ");
        int min=0,max=6;   //range [0,6)  1 to 6
        int diceRoll = min+(int)((Math.random()*(max-min)+1));  //best
        System.out.println("DiceRoll = "+diceRoll);
        System.out.println("Another way to get random from 1 to 6");
        System.out.println(roll());


        System.err.println("\n\nchallenge 4 ");
        System.out.print("Guess the number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int randomm =((int)Math.ceil(Math.random()*100));
        if(a== randomm) 
            System.out.println("Correct guess");
        else System.out.println("Wrong guess");


        System.out.println("\n\nchallenge 5 ");
        String arr[] = {"Aws","ome"," yeah"};
        StringBuilder sb = new StringBuilder(arr[0]);
        sb.append(arr[1]).append(arr[2]);
        System.out.println(sb);

        


        sc.close();
    }
    static int roll(){
        double rand = Math.random()*6;
       
        return (int)Math.ceil(rand);
    }
}
