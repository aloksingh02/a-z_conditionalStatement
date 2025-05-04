import java.util.Scanner;
public class Conditional_oddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("it is a even number");
        }
        else{
            System.out.println("it is odd number");
        }
    }
}
