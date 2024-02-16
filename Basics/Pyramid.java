package Basics;

import java.util.Scanner;

// left triangle
// public class Pyramid {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Number of rows: ");
//         int n = sc.nextInt();
//         System.out.println("\n\n");

//         int i,j;
//         for(i=1;i<=n;i++){
//             for(j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }

// --------------------------------------------

//  left upside down triangle 5* 1st row

// public class Pyramid {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Number of rows: ");
//         int n = sc.nextInt();
//         System.out.println("\n\n");
        
//         int i,j;
//         for(i=1;i<=n;i++){
//             for(j=n;j>=i;j--){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }

// --------------------------------------------

//  right side triangle

// public class Pyramid {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter Number of rows: ");
//         int n = sc.nextInt();
//         System.out.println();
        
//         int i,j;
//         for(i=1;i<=n;i++){
//             for(j=1;j<=n;j++){
//                 if(j<=n-i)
//                 System.out.print(" ");
//                 else
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     }
// }

// --------------------------------------------

//  right side upside down triangle

public class Pyramid {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number of rows: ");
        int n = sc.nextInt();
        System.out.println();
        
        int i,j;
        for(i=n;i>=1;i--){
            for(j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

// ----------------------------------------


// proper pyramid


