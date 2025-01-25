/*pointer on array*/
/*
#include<iostream>
using namespace std;
int main(){
    int A[5]={2,4,6,8,10};
    int *p=A; // no need to use &A[0] because array name itself is a pointer
    cout << *p << endl;
    for(int i=0;i<5;i++){
       // cout <<A[i]<<endl;
        // now using pointer
        cout << p[i]<< endl;
    }
}
*/

/*creating an array in heap */
/*
#include<iostream>
using namespace std;
int main(){
    int *p; // declare a pointer 
    //using a malloc function or new operrator to create an array in heap
    p=new int[5]; // this will create an array of 5 integer in heap
    p[0]=12;p[1]=14;p[2]=16;p[3]=18;p[4]=20; // assigning value to the array
    for(int i=0;i<5;i++){
        cout << p[i]<<endl;
        
    }
    // remeber once created an array in heap we have to delete it
    delete []p; // in c++ we use delete []p to delete an array in heap
    return 0;
}
*/


// lets see how many bytes pinter takes in memory
#include<iostream>
using namespace std;
int main(){
    int *p;
    char *c;
    float *f;
    double *d;
    struct rectangle *r;
    cout << sizeof(p)<<endl;
    cout << sizeof(c)<<endl;
    cout << sizeof(f)<<endl;
    cout << sizeof(d)<<endl;
    cout << sizeof(r)<<endl;

    // so we can see that pointer takes 4 bytes in memory
}