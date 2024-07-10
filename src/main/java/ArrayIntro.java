// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

class B {
  int x;
  int y;

  B(int a, int b) {
    x = a;
    y = b;
  }
}

public class Main {
  
  public static void main(String[] args) {
    System.out.println("Hello world!");

    //System.out.println(Math.pow(6,10000));

    //Array of Integers
    int[] myIntArray = new int[10];
    System.out.println(myIntArray[0]);

    //Array of Strings
    String[] myArray = new String[10];
    System.out.println(myArray[0]);

    //Array of Objects
    B b = new B(1,2);
    B b1 = new B(3,4);

    //An Arrays of objects
    B[] myArray2 = new B[2]; 
    System.out.println(myArray2[0]);
    
    myArray2[0] = b;
    System.out.println(myArray2[0]);
    
  }

  // @Test
  // void addition() {
  //     assertEquals(2, 1 + 1);
  // }
}
