import java.util.Scanner;
// This programme  is to check if input number is Prime number or not.
public class PrimeNumbers {
    // A prime number can be divided, without a remainder,only by itself and by 1.
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Start number: ");
        int i = scanner.nextInt();
        System.out.print("Enter a End number: ");
        int j = scanner.nextInt();

        for(i =2;i<100;i++){
            int count=1;
            for(j=2;j<i;j++){
                if(i%j ==0){
                    count=0;
                    break;
                }
            } if(count==1){
                System.out.println( " Prime Number is " + i );
            }
        }
    }
}
