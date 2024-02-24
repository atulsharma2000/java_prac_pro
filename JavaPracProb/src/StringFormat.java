public class StringFormat {
    
    public static void main(String[] args) {
        
        String name = "atul";
        int marks = 45;
        System.out.println("Hello "+name+" , your marks are "+marks);
        // this created lot of strings in string pool
        // so to solve this

        System.out.printf("Hello %s your marks are %d",name,marks);

        int a=123456789;
        System.out.printf("%15d",a);

    }
}
