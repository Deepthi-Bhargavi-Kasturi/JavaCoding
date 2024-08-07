//Method Signature
//----------------
/* 
-> In Java, method signature is "method name followed by argument types"

public int m1(int i, float f) {

}

"Method Signature: m1(int, float)"

-> Return type is not part of Method Signature. Unlike in C++ and other languages.


-> Compiler uses these method signatures to resolve method calls.

How? : Compiler maintains a Table for every class with method signatures. Which it refers to, to identify if the method being called is available for that specific class.


From the below Example: 

Table:

Test
----
m1(int)
m2(string)

*/
class Test {

    public void m1(int i) {
        System.out.println(i);
    }

    public void m2(String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {
        Test t = new Test();

        t.m1(10);
        t.m2("Deep");
        t.m3(10.5);
    }
}

//Output
/* error: cannot find symbol
        t.m3(10.5);
         ^
  symbol:   method m3(double)
  location: variable t of type Test
*/


/*
-> If there is a class with two methods having the same method signature, then it will result in Compilation error

-> From the below example, the method signature will be m1(int). As we have known earlier that, in java the return type is not part of method signature.
*/
class Test2 {

    public void m1(int i) { 
        System.out.println(i);
    }

    public int m1(int k) { //Duplicate method m1(int) in type Test2
        return 10;
    }

    public static void main(String[] args) {
        Test2 t2 = new Test2();
        t2.m1(20);
    }

 }

//output
//error: method m1(int) is already defined in class Test2