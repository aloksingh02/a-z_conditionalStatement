import java.util.Scanner;
public class Conditional_charType {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch = sc.next().charAt(0);

        if (Character.isDigit(ch)) {
            System.out.println("the character is number");
        } else if (Character.isLetter(ch)) {
            System.out.println("the character is letter");
        } else{
            System.out.println("It is special character");
        }
    }
}
