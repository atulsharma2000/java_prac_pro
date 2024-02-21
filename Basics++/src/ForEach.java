public class ForEach {

    public static void main(String[] args) {
        String[] str = {"aa","bb","ccc","dd","ee"};

        for(String n: str){
            if(n=="bb") continue;
            if(n=="ee") break;
            System.out.println(n); 
        }
    }   
}
    
