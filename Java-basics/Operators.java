import java.util.*;
public class Operators {
    public static void main( String args[]){
        int A =10;
        int B =20;
        System.out.println("add ="+((A+B)));
        System.out.println("subtract ="+((A-B)));
        System.out.println("multiply ="+((A*B)));
        System.out.println("remainder using modulo operator ="+((A%B)));
        /*remainder is calculated as A-(B*(A/B)) */
    }
}