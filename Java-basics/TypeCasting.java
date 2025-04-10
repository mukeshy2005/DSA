import java.util.*;
public class TypeCasting{
    public static void main(String args[]){
    Scanner sc= new Scanner (System.in);
    // lets take two numbers as input from user
   // float a= sc.nextFloat();
   // int b=a; // thi wll give error because we are trying to convert a larger data type to a smaller data type lossing data
   //  int b=(int)a; // explicit type casting is done manually by the programmer
   //  System.out.println(b);
   char ch='a';
   int ascii=ch;
   System.out.println(ascii); // implicit type casting is done automatically by the compiler
   // explicit type casting is done manually by the programmer
    }
}