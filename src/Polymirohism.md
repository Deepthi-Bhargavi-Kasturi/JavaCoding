## Polymorphism



### Case - 3 

*_When two or more methods are having the same priority. Compiler will throw error stating that it is ambiguous

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




