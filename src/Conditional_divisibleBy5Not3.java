import java.util.Scanner;
public class Conditional_divisibleBy5Not3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();

        if(a%5==0 && a%3!=0){
            System.out.println("it is divisible by 5 but not with 3");
        }

        else{
            System.out.println("it is not divisible by 5");
        }
    }
}
