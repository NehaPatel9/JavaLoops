import java.util.Scanner;

public class factorialValue {
    /*This a program to find the factorial value of any number entered through the keyboard.
    For eg. 5! = 5 * 4 * 3 * 2 * 1 = 120 */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive  Number");
        int number = scanner.nextInt();
        long fact = 1;
        int i = 1;
        if (number < 0) {
            System.out.println("This is not a positive number");
        } else {
            while (i <= number) {
                fact = fact * i;
                i++;
            }
            System.out.println("Factorial of " + number + " is: " + fact);
        }
    }
}