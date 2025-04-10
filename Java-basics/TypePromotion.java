// public class TypePromotion{
//     public static void main(String args[]){
//       char a = 'a';
//       char b= 'b';
//       int c = (int)a;
//       System.out.println(c);
//       System.out.println((int)(a));
//       System.out.println(a+b);  
//     }
// }

public class TypePromotion{
    public static void main(String args[]){
        // short a= 10;
        // char b= 'a';
        // byte c= 5;
        // // byte d = a+b+c;
        // long e= a+b+c;
        // System.out.println(e); // implicit type casting

        // System.out.println(d); // th   is will give error because we are trying to convert a larger data type to a smaller data type lossing data
        // System.out.println(a+b+c);
        byte b =5;
        b= (byte)(b*2); // explicit type casting is done manually by the programmer
        System.out.println(b); // implicit type casting is done automatically by the compiler
        b= b*2; // implicit type casting is done automatically by the compiler
        System.out.println(b); // explicit type casting is done manually by the programmer

    }

}