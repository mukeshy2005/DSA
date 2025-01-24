/*pointer on array*/
#include<iostream>
using namespace std;
int main(){
    int A[5]={2,4,6,8,10};
    int *p=A; // no need to use &A[0] because array name itself is a pointer
    cout << *p << endl;
}
