import java.util.Scanner;

public class CountNumber {
    public static void main(String[] main) {
        int positive = 0, negative = 0, zero = 0;
        char choice;

        do {
            System.out.println("Enter a number: ");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();

            if (number > 0) {
                positive++;
            } else if (number < 0) {
                negative++;
            } else {
                zero++;
            }

            System.out.println("Do you want to Continue(y/n)? ");
            Scanner scanner1 = new Scanner(System.in);
            choice = scanner1.next().charAt(0);
        } while (choice == 'y');



        System.out.println("Total Positive Number : " + positive);
        System.out.println("Total Negative Number : " + negative);
        System.out.println("Total Zero Number : " + zero);
    }
}