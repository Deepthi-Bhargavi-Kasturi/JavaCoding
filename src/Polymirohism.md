## Polymorphism

### Summary: Overloading Case Studies

* When there are 2 or more methods with arguments passed. And those arguments have parent-child class relation, then child class type argument will get first priority
  * If method holding Child Class argument type is not available, then method with Parent class argument type will get executed.
  * Ref: Case 2
* When two or more methods are having the same priority. Compiler will throw error stating that it is ambiguous
  * Ref: Case 3




### Case - 3 

**_When two or more methods are having the same priority. Compiler will throw error stating that it is ambiguous_

```java

class Main {

      public void m(String s) {
        System.out.println("String Version");
      }

      public void m(StringBuffer sb) {
        System.out.println("String Buffer Version");
      }

      public static void main(String[] args) {

        Main t = new Main();

        t.m("Deep"); //exact match is method which takes String as an argument.
          //Output: String Version
        
        t.m(new StringBuffer("Deep")); //exact match is the method which takes StringBuffer 
          //Output: // String Buffer Version

        t.m(null); 
        /*Compilation Error: ./src/main/main.java:21: error: reference to m is ambiguous
                  t.m(null);
                   ^
            both method m(String) in Main and method m(StringBuffer) in Main match
          1 error*/
          //Reason: Both String and StringBuffer are child classes to Object. And there is no inter-relation between String and StringBuffer. So, as per the compiler it is ambiguous on, to which method to exectue.

      }


}


```

### Case 4

We have a concept called var-arg method introduced in Java 1.5

```
methodName(dataType... data)

Ex: m(int... i);
```

This method takes 0 or more arguments.  
Some Examples Include:  
  1. m();
  2. m(10);
  3. m(10,20); etc

* When we have General and Var-arg argument types accepting methods in a class. And when the method is called on the classs' reference with a Single argument, then always general method will get first priority.
* Var-arg always be least priority
* General rule of Thumb is: when we have like a conflict / battle of priorities between Java's old and new concepts, the preference is always given to old concepts. So, in this case it is General one.

```java

class Main {

  public void m(int i) {
    System.out.println("General Method");
  }

  public void m(int... i) {
    System.out.println("Var-arg Method");
  }

  public static void main(String[] args) {
      
    Main obj = new Main();

    obj.m(); //Var-arg Method : No Parameters are passed, which Var-arg can accept 
    obj.m(10,20); //Var-arg Method
    obj.m(10); //General Method: both var-arg and general types can accept one argument. So priority is given to General method
      
  }

}

```








