package equals;
public class Test {
   // UNDERSTAND Equalss
    int a;
    String name;
    
    public Test(int a, String name) {
        this.a = a;
        this.name = name;
    }

    public static void main(String[] args) {
                String str="aaa";
                String str2="aaa";
            System.out.println(str.equals(str2));  //true
            
                String st1 = new String();
                st1="asas";
                String st2 = new String();
                st2="asas";
            System.out.println(st1.equals(st2)); //true


            String st3 = new String();
            st2="aaa";
            System.out.println(st3.equals(str)); // false



        System.out.print("object 1 == object 2 ? :- ");
        Test obj1 = new Test(1,"atul");
        Test obj2 = new Test(1,"atul");

        System.out.println(obj1.equals(obj2));  // it returns false when we use default equals
                                                // it will return true when we define equals method to compared member values;

    }

    @Override
    public boolean equals(Object obj){
        if(!(obj instanceof Test))
             return false;
        else {
            Test per = (Test)obj;
            return per.a==a && per.name.equals(name);
        } 
    }
}
