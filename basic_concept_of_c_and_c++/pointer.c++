/*
What is a pointer?

A pointer is a variable that stores the memory address of another variable.
Pointers are used for indirect access to data and are essential for dynamic memory allocation.
They allow efficient array and string manipulation, and are used to access heap memory.
*/

#include<iostream>
#include <stdlib.h>
using namespace std;
int main(){
    int a=10;// a is a variable that stores the value 10 ( data variable)
    int *p; // p is a pointer that store the address of data variable
    p=&a; // p stores  the addresso of a
    // to access the value usinng pointer 
    cout << a << endl;// 10
    cout << &a << endl; // address of a
    cout << p << endl; // address of a
    cout << *p << endl; // va;ue of a

    // to acces the heap memory 
    // using c
    // we use malloc
    int *q;
    q=(int*)malloc(5*sizeof(int)); // 5*4=20 bytes
    // the inter is created in the heap memory and taking 20 bytes
} /*using c++
   p=new int[5]*/