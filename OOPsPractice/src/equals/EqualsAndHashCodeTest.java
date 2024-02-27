package equals;

public class EqualsAndHashCodeTest {
    public static void main(String[] args) {
        Person person1 = new Person("Prashant", 30, "001");
        Person person2 = new Person("Prashant", 30, "001");

        // this equals() is defined in Person.java files to compare object values of two objects with different refrences
        // equals by default will return false cuz objects are created in Heap. Its not like string pool (where it returns true when st1.equals(st2) when st objects are pointing to same string in string pool )

        if (person1.equals(person2)) {
            System.out.println("Equals");
        } else {
            System.out.println("Not equal");
        }
    }
}
