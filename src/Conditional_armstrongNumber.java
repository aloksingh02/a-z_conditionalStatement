import java.util.Scanner;
public class Conditional_armstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int originalNum = num;
        int digits= String.valueOf(num).length();
        int sum = 0;

        while(num >0){
            int digit = num%10;
            sum+=Math.pow(digit, digits);
            num/=10;
        }
        if(sum==originalNum){
            System.out.println("it is armstrong number");
        }
        else{
            System.out.println("it is not armstrong number");
        }
    }
}
