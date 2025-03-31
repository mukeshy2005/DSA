//import java.util.*;// import the Scanner class from java.util package
//public class Input{
   // public static void main(String args[]){
       // Scanner sc =new Scanner(System.in);// Scanner class is used to take input from user
      //  String input =sc.next(); // .next is used to take a string input 
     //    System.out.println(input);

        // for printing the complete line or a word after space we use .nextLine()
      /*   String input1 =sc.nextLine();
        System.out.println(input1);*/

      //  int number =sc.nextInt(); //  for taking integer input we use .nextInt()
      //  System.out.println(number);

        //float number1 = sc.nextFloat(); // for taking integer input we use .nextInt()
     //   System.out.println(number1);
    //} // Scanner is automatically closed here
   // }


  /* above thing is bad practice  */
  // i am writig the new code again below
 import java.util.*;// import the Scanner class from java.util package
  public class Input{
    public static void main(String args[]){
     Scanner sc= new Scanner(System.in);
    /*  int input1=sc.nextInt();
     System.out.println(input1);
     sc.close(); */
     // lets use another method to take input other data types 
     double input2=sc.nextDouble();
     System.out.println(input2);
     sc.close();
    }
  }
