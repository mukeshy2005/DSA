// public class methods {
//     public static int sum(int a, int b){
//         return a+b;
//     }
//     public static int sum(int a, int b , int c){
//         return a+b+c;
//     }
//     public static void main(String args[]){
//      System.out.println(sum(6,7,8));
//     }
// }

/*there are some optimised code for for checking if a number is prime or not  */

// to check if a number is prim eor not 
/* 
import java.util.*;
public class methods{
    public static boolean isPrime(int n){
    // there are some corner cases    
        boolean isPrime = true;
        for(int i=1;i<n-1;i++){  
            if(n%i==0){
                isPrime = false;
                break  ;
            }
        } 
        return isPrime;
    }
    public static void main(String args[]){
   System.out.println( isPrime(8));
    }
}

*/
// Optimised code for checking if a number is prime or not
import java.util.*;
public class methods{
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void primeInRange(int n){
        for( int i =2;i<=n;i++){
          if(isPrime(i)){
            System.out.print(i+" ");
          }  
        }
    }
    public static void main(String args[]){
       primeInRange(1000);
    }
    
}