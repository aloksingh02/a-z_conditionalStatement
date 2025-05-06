import java.util.Scanner;
public class Conditional_straightLineBy3Point {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input x1");
        float x1 = sc.nextFloat();
        System.out.println("Input x2");
        float x2 = sc.nextFloat();
        System.out.println("Input x3");
        float x3 = sc.nextFloat();

        System.out.println("Enter y1");
        float y1 = sc.nextFloat();
        System.out.println("Enter y2");
        float y2 = sc.nextFloat();
        System.out.println("Enter y3");
        float y3 = sc.nextFloat();

        float m1 = ((y2-y1) / (x2-x1));
        float m2 = ((y3-y2) / (x3-x2));

        if(m1 == m2){
            System.out.println("It make a straight line");
        }
        else{
            System.out.println("it is not straight line");
        }
    }
}
