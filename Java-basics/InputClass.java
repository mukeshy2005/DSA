// import java.util.*;
// public class InputClass {
//     public static void main(String args[]){
//         Scanner sc= new Scanner(System.in);
//         //String name = sc.next();
//         String name = sc.nextLine(); // nextLine() reads the entire line including spaces
//         System.out.println(name);
//     }
// }

import java.util.*;
public class InputClass{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // taking input two numbers from user 
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int sum =a+b;
        // System.out.println(sum);

        // for area of a circle 
        // we need radius and value of pi
        // Float radius = sc.nextFloat();
        // Double pi = 3.14; // here by default pi is double but we are converting it to float that is not possible in java so we are using Float type variable
        // Double area = pi*radius*radius;
        // System.out.println("Area of circle is: " + area); 

        // explicit conversion basically type castng
        // float a= 10.5f;
        // int b=(int)a;
        // System.out.println("Value of b is: " + b); // this will give error because float to int conversion is not possible in java without explicit type casting
        // implicit conversion
        // int c =10;
        // float d = c;
        // System.out.println("Value of d is: " + d); // this will not give error because int to float conversion is possible in java without explicit type casting
       // char ch ='A';
       // System.out.println("ASCII value of " + ch + " is: " +(int) ch); // this will give ASCII value of character A
  //       int x= 2, y=5;
    //   int exp1 = (x*y/x);
      // int exp2 = (x*(y/x));
       //System.out.println(exp1+"^");
       //System.out.println(exp2);// uutput is 4 as float will be converted to int and decimal part will be truncated
    //    int x =200 ,y=50,z=100;
    //    if (x>y && y >z){
    //     System.out.println("Hello");
    //    }
    //    if(z>y && z<x){
    //     System.out.println("World");
    //    }
    //    if ((y+200 )<x && (y+150)<z){
    //     System.out.println("Java");
    //    } 
       

    //calculator using switch case
     System.out.println(" Enter first number :");
     int numb1 = sc.nextInt();
        System.out.println(" Enter second number :");
        int numb2 = sc.nextInt();
        System.out.println("enter the operator");
        char operator = sc.next().charAt(0);

        switch (operator){
            case '+' : System.out.println("Sum is: " + (numb1 + numb2));
                break;
            case '-' : System.out.println("Difference is: " + (numb1 - numb2));
                break;
            case '*' : System.out.println("Product is: " + (numb1 * numb2));
                break;      
            case '/' : System.out.println("Quotient is: " + (numb1 / numb2));
                break;
            case '%' : System.out.println("Remainder is: " + (numb1 % numb2));
                break;
            default : System.out.println("Invalid operator");
                break;                
        }
    }

}