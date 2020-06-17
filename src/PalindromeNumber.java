import java.util.Scanner;

public class PalindromeNumber {
    /*A palindromic number is a number (in some base ) that is the same when written forwards or backwards,
    i.e., of the form. . The first few palindromic numbers are therefore are
     0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111, 121*/
    public static void main(String args[]){
        int reminder,sum=0,temp;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        temp=number;
        while(number>0){
            reminder=number%10;
            sum=(sum*10)+reminder;
            number=number/10;
        }
        if(temp==sum)
            System.out.println("Number is Palindrome Number ");
        else
            System.out.println("Number is Not Palindrome");
    }
}
