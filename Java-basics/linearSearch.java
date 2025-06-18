public class linearSearch {
    public static int search (int number[],int key){
        for(int i=0;i<number.length;i++){
            if(number[i]==key){
                return i;
            }
            
        }
        return -1;
    }
    public static void main(String args[]){
    // int number[]={6,8,9,45,98,46,8,10};
    // int key =9;
    // System.out.println(search(number,key));
    
    }
}
