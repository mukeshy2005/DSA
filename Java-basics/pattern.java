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
            for(int j=1;j<n-i;j++){
                System.out.print(" ");

            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
             System.out.println();
        }
           
    }

    public static void main(String args[]){
    // pattern(8,15);
    invPyramid(5);
    }
}