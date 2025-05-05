import java.util.Scanner;
public class Conditional_divisibleBy3And5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();

        if(a%3==0 && a%5==0){
            System.out.println("it is divisible by both 3 and 5");
            return;
        }

        if(a>0 && a%3==0){
            System.out.println("it is divisible 3");
        }
        else if(a>0 && a%5==0){
            System.out.println("it is divisible 5");
        }
        else if(a>0 && a%3==0){
            System.out.println("it is divisible 3");
        }
        else{
            System.out.println("It is not divisible by both");
        }
    }
}
