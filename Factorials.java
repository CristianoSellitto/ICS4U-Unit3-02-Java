/*
* This program finds the factorial of an integer a user enters using a method.
*
* @author  Cristiano Sellitto
* @version 1.0
* @since   2024-04-20
*/

import java.util.Scanner;

/**
* This is the program.
*/
final class Factorials {
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this is ever called
    *
    * @throws IllegalStateException if this is ever called
    *
    */
    private Factorials() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * Finds the factorial of an integer.
     *
     * @param integer the integer to use
     * @return the factorial of the integer
     */
    static int factorial(int integer) {
        final int factorial;

        if (integer < 0) {
            factorial = -1;
        } else if (integer <= 1) {
            factorial = 1;
        } else {
            factorial = integer * factorial(integer - 1);
        }

        return factorial;
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // Scanners
        final Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            final int factorialOfInt =
                factorial(Integer.parseInt(input.nextLine()));
            System.out.println(
                "The factorial of this number is " + factorialOfInt
            );
        } catch (NumberFormatException nfe) {
            System.out.println("This is not an integer.");
        }

        // Close scanners
        input.close();

        // Show the program as done
        System.out.println("\nDone.");
    }
}
