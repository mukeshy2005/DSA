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
    cout << r.length << endl; // print the value of length

}
*/

/*created dynamically*/
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