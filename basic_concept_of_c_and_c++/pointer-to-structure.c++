/* a pointer to structure*/
/*creadted statically */
/*
#include<iostream>
using namespace std;
// define a structure
struct rectangle{
    int  length; // declare a variable
    int breadth; // declare a variable

};
int main(){
    struct rectangle r={10,5}; // declare a structure variable and initialize it
    struct rectangle *p=&r; // declare a pointer to structure and initialize it with the address of r
    (*p).length=20; // change the value of length using pointer
    r.length=30;// change the value of length using variable
    cout << r.length << endl;
    cout << (*p).length<< endl; // this wwill also print the value of length
    // for a  varibel we can use the following syntax    
    // for normal variable use . operator and  for  pointer use -> operator or (*p).operator

}
*/


/*created dynamically*/
/*
#include<iostream>
using namespace std;
// define a structure
struct rectangle{
    int  length; // declare a variable
    int breadth; // declare a variable

};
int main(){
    struct rectangle *p; // declare a pointer to structure
    p=new rectangle;// allocate memory to the pointer
    (*p).length=10; // change the value of length using pointer
    cout << p->length << endl; // print the value of length
}
*/



// how to create an object of rectangle structure using pointer
#include<iostream>
#include<stdio.h>
#include<stdlib.h>
using namespace std;
// define a structure 
struct rectangle{
   int length=2;
   int breadh=3;

};
int main(){
    struct rectangle *p; // declare a pointer to structure
    // to create an object 
    p=(struct rectangle *)malloc(sizeof(struct rectangle)); // allocate memory to the pointer
  //  Rectangle* p = new Rectangle; // another way to allocate memory to the pointer in c++
    (*p).length=10; // change the value of length using pointer
    (*p).breadh=5; // change the value of breadth using pointer
    cout << (*p).length << endl; // print the value of length   
    cout << (*p).breadh << endl; // print the value of breadth
    


}