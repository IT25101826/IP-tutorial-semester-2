// Class to check Even or Odd
class EvenOddNumber {

    // Method to check number
    boolean findEvenOrOdd(int i) {
        if (i % 2 == 0) {
            return true;   // Even number
        } else {
            return false;  // Odd number
        }
    }
}

// Demo class with main method
public class IP_tutorial_Lab3 {
    public static void main(String[] args) {

        // Creating object of EvenOddNumber class
        EvenOddNumber obj = new EvenOddNumber();

        int num = 10;

        // Calling method
        boolean result = obj.findEvenOrOdd(num);

        // Display output
        if (result) {
            System.out.println(num + " is an Even number");
        } else {
            System.out.println(num + " is an Odd number");
        }
    }
}