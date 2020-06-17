import java.util.Scanner;
// this programme is for input any five digit number and then find sum of each digit
public class SumFiveDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Five Digit Number");
        int No = scanner.nextInt();
        int sum = 0;
        if (No / 10000 >= 10 || No / 10000 <= 0) {
            System.out.println("not 5 digit number");
        } else {
            while (No > 0) {
                sum = sum + No % 10;
                System.out.println(sum);
                No = No / 10;
                System.out.println(No);
            }
            System.out.println(sum);
        }
    }

}