import java.util.Scanner;
public class Conditional_threeDigitNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();

        if(a>99 && a<1000){
            System.out.println("It is 3 digit number");
        }
        else{
            System.out.println("it is not 3 digit number");
        }
    }
}
