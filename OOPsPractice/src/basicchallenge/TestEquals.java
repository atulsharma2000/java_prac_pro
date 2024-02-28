package basicchallenge;

import java.util.Objects;

public class TestEquals {
    int id;
    String name;
    
    TestEquals(int id,String name){
        this.id = id;
        this.name = name;
    }
    // @Override
    // public boolean equals(Object o){
    //     if(this == o) return true;
    //     if(o==null || getClass()!=o.getClass())
    //         return false; 
    //     TestEquals test = (TestEquals)o;
    //     return id==test.id && Objects.equals(name, test.name);
    // }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        TestEquals other = (TestEquals) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }

    public static void main(String[] args) {
        TestEquals ob1 = new TestEquals(1,"atul");
        TestEquals ob2 = new TestEquals(1,"atul");

        System.out.println(ob1.equals(ob2));
    }
}
