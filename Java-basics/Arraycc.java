import java.util.*;
public class Arraycc {
    public static int trappedRainWater(int hieght[]){
          int n= hieght.length;
       //calculate left boundary
       int leftmax[]=new int [n];
       leftmax[0]=hieght[0];
       for(int i = 1;i<n;i++){
         leftmax[i]=Math.max(hieght[i],leftmax[i-1]);
       }

       // calculate right boundary
       int rightmax[]=new int[n];
       rightmax[n-1]=hieght[n-1];
       for(int i =n-2;i>=0;i--){
         rightmax[i]=Math.max(hieght[i],rightmax[i+1]);
       }

       int trappedWater= 0;
       for(int i=0;i<n;i++){
         int waterLevel=Math.min(leftmax[i],rightmax[i]);
         trappedWater+=waterLevel-hieght[i];
       }
       return trappedWater;
       //min(leftmax-bond,rightmax-bond)
    }
    public static void triplet(int nums[]){
      int num1;
      int num2=0;
      int num3=0;
     for(int i=0;i<nums.length;i++){
      
       num1=nums[i];
       for(int j=i;j<nums.length;j++){
         if(nums[i]!=nums[j]){
            num2=nums[j];
         }
         
         for(int k=j;k<nums.length;k++){
            if(nums[j]!=nums[k]){
          num3=nums[k];
            }
            
         }
       }
       System.out.println("("+num1+","+num2+","+num3+")");
     }
    }
   public static void main(String args[]){
   //  int hieght[]={4,2,0,6,3,2,5};
    
   //  System.out.println(trappedRainWater(hieght));
    int nums[]={-1,0,1,2,-1,-4};
     triplet(nums);
   } 
}
