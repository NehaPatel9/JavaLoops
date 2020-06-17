import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String args[]) {
        int n, c;
        System.out.println("Enter an integer to print it's multiplication table");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        int i = 1;
        do {System.out.println(n + "*" + i + " = " + (n * i));
        i++;}
            while (i <= 10);

        }
}
