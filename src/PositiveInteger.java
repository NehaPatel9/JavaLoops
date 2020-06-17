import java.util.Scanner;
/* a program that prompts the user to input a positive integer.
It should then print the multiplication table of that number*/

class PositiveInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Positive Number");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("This is not a positive number");
        } else {
            while (num >= 0) {
                for (int i = 1; i <= 10; i++) {
                    System.out.println(num * i);

                }
                break;
            }

        }
    }
}