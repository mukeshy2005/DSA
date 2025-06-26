import java.util.*;
public class arrayAssignment {
    // Q1 creating a function for question 1
    public static void match(int nums[]){
    
        for(int i=0;i<nums.length;i++){
           int key=nums[i];
           for(int j=i;j<nums.length;j++){
            if(j==nums[i]){
                System.out.println(nums[i]);
            }
           } 
               
        }
        
            
            
    }
    public static void main(String args[]){
    int nums[]={1,2,7,4};
    
    
    match(nums);
    
    }
}
