#include<iostream>
using namespace std;
int main(){
    int n;
    cout << " enter a integer value " << endl; // taking an input value from the user 
    cin >> n;
    int A[n];
    A[0]=10;
    cout << sizeof(A) << endl;
    for(int x:A){
        cout << x << endl;
    }
// 0 is also a garbage value 
}