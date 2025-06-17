import java.util.*;
public class Functions {
    
    //  public static int multiply( int a, int b){
    //     int product = a*b; 
    //     return product;
  //}
  /*to calculate the factorial */


  public static int factorial(int n){
    int facto = 1;
    for(int i =1;i<=n;i++){
         facto = facto*i;
    }
    return facto;
  }
  public static int binomianlCoefficient(int n,int r){
    int n_fact =factorial(n);
    int r_fact = factorial(r);
    int n_r_fact = factorial(n-r);
    int binomialCoefficient = n_fact / (r_fact * n_r_fact);
    return binomialCoefficient;

  }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    //     System.out.println("Enter two integers to multiply:");
    //   int a = sc.nextInt();
    //   int b = sc.nextInt();
    //  int prod = multiply(a,b);
    //     System.out.println("The product is: " + prod);
    //     sc.close();
    // System.out.println("Enter a number to calculate its factorial:");
    // int n =sc.nextInt();
    // Initialize facto to 1
  
    System.out.println(binomianlCoefficient(5, 3));
    sc.close();
      
    }
    
}
