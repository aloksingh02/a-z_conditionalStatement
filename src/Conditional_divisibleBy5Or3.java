import java.util.Scanner;
public class Conditional_divisibleBy5Or3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();

        if(a%5==0 || a%3==0){
            System.out.println("it is divisible by 5 or 3");
        }
        else{
            System.out.println("it is neither divisible by 5 or 3");
        }
    }
}
