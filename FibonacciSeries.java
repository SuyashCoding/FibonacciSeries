import java.util.Scanner;

/**
 * fibonacci series
 * @author Suyash Patel
 */
public class FibonacciSeries {
    /**
     * finds the fibonacci series
     * @param n nth term
     * @return fibonacci series
     */
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    /**
     * main method
     * @param args arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Up to which term do you want to print the Fibonacci series? ");
        int n = scanner.nextInt();
        System.out.println("Fibonacci series up to " + n + " terms: ");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        scanner.close();
    }
}
