import java.util.Scanner;

public class ReverseNumber {
    //input any five digit number and then reverse the number
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Five Digit Number");
        int num = scanner.nextInt();
        int reverseNum = 0;
        int digit = 0;
        reverseNum = 0;

        if (num / 10000 >= 10 || num / 10000 <= 0) {
            System.out.println(num + " : is not 5 digit number");
        } else {
            while (num > 0) {
                digit = num % 10;
                reverseNum = reverseNum * 10 + digit;
                num = num / 10;
            }
            System.out.println("Reverse of the Number: " + reverseNum);
        }
    }
}