import java.util.Scanner;
public class Conditional_twoDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();

        if(a>10 && a<100){
            System.out.println("It is two digit number");
        }
        else{
            System.out.println("It is not 2 digit number");
        }
    }
}
