import java.util.*; // import the Scanner class from java.util package
public class PracticeSession1{
    public static void main( String args[]){
       /*
       Question 1 : In a program, input 3 numbers : A, B and C. You have to output the average of
these 3 numbers.

        */ 
    /*  Scanner sc= new Scanner(System.in);
     int A = sc.nextInt();
     int B = sc.nextInt();
     int C = sc.nextInt();
     int avg = (A+B+C)/3;
     System.out.println(avg);
     */


     /*Question 2: In a program, input the side of a square. You have to output the area of the
square.
 */

   Scanner sc = new Scanner(System.in);
   /* 
   float side = sc.nextFloat();
   float area = side*side;
   System.out.println(area);
   */
  
   /*Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
an eraser. You have to output the total cost of the items back to the user as their bill.
(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem) */
   
/* 
    float pencil = sc.nextFloat();
    float pen = sc.nextFloat();
    float eraser = sc.nextFloat();
    float total = pencil+pen+eraser;
    float totalWithGst = total + (total*0.18f);
    System.out.println(totalWithGst);
   */

/* 
   Question 4: What will be the type of result in the following Java code?
   byte b = 4;
   char c = 'a';
   short s = 512;
   int i = 1000;
   float f = 3.14f;
   double d = 99.9954;
   
   double result = (f * b) + (i % c) - (d * s);
    System.out.println(result); // 3.14*4 + 1000%97 - 99.9954*512 = 12.56 + 30 - 51199.9992 = -51157.4392
    */

    int $ =10;
    System.out.println($); // $ is a valid variable name in java but not a good practice to use it as a variable name

  }
}