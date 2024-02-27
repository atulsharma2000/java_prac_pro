
package in.kgcoding;

import java.util.Scanner;

public class Packages {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello, World!");

        // creating object of other class from other package
        com.awesome.Awesome obj = new com.awesome.Awesome();
        obj.view();
    } 
}
