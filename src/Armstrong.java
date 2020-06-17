import java.util.Scanner;
//This programme is to check input number is Armstrong number or not
public class Armstrong {
        public static void main(String[] args)  {
            int count=0,a,t;
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            t=number;
            do {
                a=number%10;
                number=number/10;
                count=count+(a*a*a);
            } while(number>0);
            if(t==count)
                System.out.println(t + " : is Armstrong number" );
            else
                System.out.println(t + " : is Not Armstrong number");
        }
}
