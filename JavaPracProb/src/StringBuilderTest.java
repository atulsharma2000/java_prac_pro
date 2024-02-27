public class StringBuilderTest {
    
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;



    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Car{");
        sb.append("noOfWheels=").append(noOfWheels);
        sb.append(", noOfDoors=").append(noOfDoors);
        sb.append(", maxSpeed=").append(maxSpeed);
        sb.append(", name='").append(name).append('\'');
        sb.append(", modelNumber='").append(modelNumber).append('\'');
        sb.append(", company='").append(company).append('\'');
        sb.append('}');
        return sb.toString();
    }



    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Hello");
        sb.append(45);
        sb.append(" yohohohoho");
        sb.append(45.77);
        System.out.println(sb);
        //to get this in string format
        System.out.println(sb.toString());


        StringBuilderTest obj = new StringBuilderTest();
        System.out.println(obj.toString());


        
    }
}
