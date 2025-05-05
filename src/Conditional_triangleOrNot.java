import java.util.Scanner;
public class Conditional_triangleOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side a");
        float a = sc.nextFloat();
        System.out.println("Enter the side b");
        float b = sc.nextFloat();
        System.out.println("Enter the side c");
        float c = sc.nextFloat();

        if((a+b>c) && (b+c>a) && (a+c>b)){
            System.out.println("It is triange");
        }
        else{
            System.out.println("It is not triangle");
        }
    }
}
