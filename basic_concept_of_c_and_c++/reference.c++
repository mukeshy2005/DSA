/* reference feature is only available on c++ language 
 # defined as a nick given to a variable*/
 #include<iostream>
 using namespace std;
 int main(){
    int a=10;// declare a variable
    int &b=a; // declare a reference (here & stand for reference) (it must be intialized at the time of declaration)
    cout<<a<<endl;// print the value of a
    b++; // increment the value of b
    cout<<b<<endl;// print the value of b
    cout<<a<<endl;// print the value of a
 }
 // that is all about reference in c++ language we will dicuuss more about it in function portion