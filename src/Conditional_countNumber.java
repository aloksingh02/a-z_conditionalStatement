import java.util.Scanner;
public class Conditional_countNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int a = sc.nextInt();
        int count = 0;

        if(a==0)
            count = 1;
        while(a>0){
            a = a/10;
            count++;
        }
        System.out.println("Number of element is: "+count);
    }
}
