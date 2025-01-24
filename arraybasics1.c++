#include <iostream>
using namespace std;
int main(){
    int A[5]; /* here i am only declaring the array */
    A[0]=10; // here i am intializing the array
    A[1]=20;
    A[3]=30;
    cout<<sizeof(A)<<endl;
    cout << A[3] << endl;
    cout << A [2]<< endl; // this will print garbage value
    printf("%d\n", A[1]); // this is c language printing

 // declaring and intializing the array togther 
    int B[10]={0};
    cout << sizeof(B) << endl;
    cout << B[2] << endl;
    // using for loop to display and array elements
    for(int i=0; i<10; i++){
        cout << B[i] << endl;
    }

   // for (declaration : range) {
    // Code block
//}
   for (int x:B){
    cout << x << endl;
   }
    return 0;

}
