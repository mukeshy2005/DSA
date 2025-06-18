import java.util.*;
public class pattern{
    // creating a function 
    public static void pattern(int row , int col){
        // outer loop
        for(int i =1 ; i<=row ; i++){
            // inner loop 
            for(int j=1;j<=col;j++){
                // condition
                if(i==1 || i == row || j ==1 || j==col){
                 System.out.print("*");

                }else{
                    System.out.print(" ");
                }
            }System.out.println();
        } 
    }
    public static void invPyramid(int n){
        //outer loop
        for(int i=1;i<=n;i++ ){
            // inner loop 
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
             System.out.println();
        }
           
    }
    public static void array(){
    Scanner sc = new Scanner(System.in);
    int A[]=new int[10];
    System.out.println(" enter marks");
    A[0]=23;
    A[1]=sc.nextInt();
    A[2]=sc.nextInt();
      
    System.out.println(A[0]);
    System.out.println(A[1]);   
    System.out.println(A[2]);
    
A[0]=23+2;
System.out.println(A[0]);



    }

    public static void update(int marks[]){
      for(int i=0;i<marks.length;i++){
        marks[i]=marks[i]+1;
      }
    
    }

    public static void main(String args[]){
       int marks[]={92,93,99};
       update(marks);
       for(int i=0;i<marks.length;i++){
        marks[i]=marks[i]+1;
        System.out.println(marks[i]+" ");
      }
      System.out.println();
      
        
    // pattern(8,15);
    // invPyramid(5);
    // array();
    }

}