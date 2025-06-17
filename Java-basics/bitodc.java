import java.util.*;
public class bitodc{
    public static void binToDec(int binNum){
        int myNum=binNum;
        int pow = 0;
        int dec = 0;
        while (binNum>0) {
          int lastDigit = binNum%10;
          dec = dec + (lastDigit*(int)Math.pow(2,pow));
          binNum=binNum/10;
          pow++;
        }
        System.out.println(dec);
    }
    public static void decToBin( int n){
      int pow = 0;
      int bin = 0;
      
      while(n>0){
        int rem = n%2 ;
      bin = bin + (rem*(int)Math.pow(10,pow));
      pow++;
      n=n/2;
      }
      System.out.println(bin);
    }
    public static void main (String args[]){
      binToDec(100);
      decToBin(11);
    }
}