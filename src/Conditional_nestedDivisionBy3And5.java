import java.util.Scanner;
public class Conditional_nestedDivisionBy3And5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        if(a%5==0){
            if(a%3==0){
                System.out.println("number is divisible by 3 and 5");
            }
            else{
                System.out.println("not divisible");
            }
        }
        else{
            System.out.println("not divisible");
        }
    }
}
