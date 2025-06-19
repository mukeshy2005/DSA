import java.util.*;
public class getLargest {
   public static int getLargest(int number[]){
    int largest=Integer.MIN_VALUE;
    for(int i=0;i<number.length;i++){
        if(largest<number[i]){
            largest=number[i];
        }
        
    }
    return largest;
   }
   public static int searchKey(int number[],int key){
      int start =0, end = number.length-1;
      while(start<=end){
        int mid = (start+end)/2;
        if(number[mid]==key){
            return mid;
        }
        if(number[mid]<key){
            start=mid+1;
        }else{
            end = mid-1;
        }
      }
      return -1;
   }
   public static void reverseMthod1(int number[] ){
    for(int i=number.length-1;i>=0;i--){
      System.out.print(number[i]);
      System.out.print(" ");
    }
   }
   public static void reverseMethod2(int number[]){
    int first =0,last=number.length-1;
    while(first<last){
        int temp = number[last];
        number[last]=number[first];
        number[first]=temp;
        first++;
        last--;

    }

   }
   public static void main(String args[]){
    //  int number[]={8,9,2,6,7,1,5};
    //    System.out.println(getLargest(number));
    int number[]={2,4,6,8,10,12,14};
    // int key = 10;
    // System.out.println(searchKey(number,key));
    reverseMthod1(number);
    System.out.println();
    reverseMethod2(number);
    //print
for (int i = 0; i < number.length; i++) {
    System.out.print(number[i] + " ");
}
System.out.println();


 
   } 
}
