import java.util.Scanner;

public class OddEven {
/*input any five digit number then
ount total no of odd and even digit and find sum of them */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Five Digit Number");
        int num = scanner.nextInt();
        int evenCount = 0;
        int oddCount = 0;
        int evenSum = 0;
        int oddSum = 0;
        if (num / 10000 >= 10 || num / 10000 <= 0) {
            System.out.println("not 5 digit number");
        } else {
            while (num > 0) {
                int rem = num % 10;
                if (rem % 2 == 0) {
                    evenSum = evenSum + rem;
                    evenCount++;
                    num = num / 10;
                } else {
                    oddSum = oddSum + rem;
                    oddCount++;
                    num = num / 10;
                }


            }
            System.out.println("Number of Even digits: " + evenCount);
            System.out.println("Total of Even digits: " + evenSum);
            System.out.println("Number of Odd digits: " + oddCount);
            System.out.println("Total of Odd digits: " + oddSum);
        }
    }
}

