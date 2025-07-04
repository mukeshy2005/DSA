import java.util.*;
public class arrayAssignment {
    // Q1 creating a function for question 1
    public static void match(int nums[]){
         int count =0;
        for(int i=0;i<nums.length;i++){
           int key=nums[i];
           for(int j=0;j<nums.length;j++){
            if(key==nums[j]){
                count++;
                System.out.println("true");
            }
           }
               
        }
        
            
            
    }
    public static void main(String args[]){
    int nums[]={1,2,7,4};
    
    
    match(nums);
    
    }
}
