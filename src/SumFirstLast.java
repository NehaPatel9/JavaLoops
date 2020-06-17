import java.util.Scanner;

public class SumFirstLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Five Digit Number");
        int num = scanner.nextInt();
        int lastNum = num%10;
        int firstNum = num;

        if (num / 10000 >= 10 || num / 10000 <= 0) {
            System.out.println(num + " : is not 5 digit number");

        } else {

            while (firstNum >=10) {
              firstNum = num/10;
                    int SumFirstLast = firstNum + lastNum;
                    System.out.println(firstNum + " : is  First digit");
                    System.out.println(lastNum + " : is Last digit");
                    System.out.println(SumFirstLast + " : is sum of First and Last digit");{
                }
                break;
            }
        }
    }
}