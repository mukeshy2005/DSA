/*
1. define structure 
2. size of structure 
3. declaring structure
4. accessing structure members
*/
/*
#include <iostream>
using namespace std;

// 1. Define structure
struct rectangle {
    int length;
    int breadth;
};

int main() {
    // 3. Declare structure variable
    struct rectangle r = {10, 15};

    // 4. Access structure members
    cout << "Length: " << r.length << endl;
    cout << "Breadth: " << r.breadth << endl;

    // 2. Size of structure
    cout << "Size of rectangle structure: " << sizeof(rectangle) << endl;

    return 0;
}
*/

// taking some examples of structure 

/*
#include <iostream>
using namespace std;
// define structure
struct complex {
    int real;
    int imag;
};
int main(){
  //complex number 
  // declare strcutre variable 
  struct complex c;
  c.real=10;
  c.imag=20;
  cout << sizeof(complex)<<endl;
  // accesing the strcutre members 
  printf("some of real and imag %d \n ",c.real+c.imag);
} */


// another example of structure is students information

/*
#include <iostream>
using namespace std;
// define structure 
struct student {
    int roll;
    char name [20];
    char department[25];
    char address[50];
};
int main(){
    // declare the structure variable
    struct student s={1,"mukesh","mechanical","janakpuri"};
    cout << sizeof(student)<<endl;
}

*/

//another example of structure is playing cards

/*
#include <iostream>
using namespace std;
// define structure 
struct card{
    int face;
    int color;
    int shape;

};
int main(){
    // declare the structure variable
    struct card c;
    c.face=1;
    c.color=2;
    c.shape=3;
    cout << sizeof(card)<<endl;
    cout << "face of card is "<<c.face<<endl;
}
*/

// another example of deck of cards

/*
int main(){
struct card deck[52]; 
}
*/

// padding in structure
// 