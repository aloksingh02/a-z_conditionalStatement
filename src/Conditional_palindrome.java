import java.util.Scanner;
public class Conditional_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int original = sc.nextInt();
        int num = original;
        int reverse = 0;

        while(num!=0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
            if(original==reverse){
                System.out.println("it is palindrome");
            }
            else{
                System.out.println("it is not palindrome");
            }

    }
}
