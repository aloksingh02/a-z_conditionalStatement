import java.util.Scanner;
public class Conditional_liesOnXaxisYaxis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of x-axis value");
        float x = sc.nextInt();
        System.out.println("enter value of y-axis value");
        float y = sc.nextInt();

        if(x==0 && y==0){
            System.out.println("lies on 0");
        }
        else if(x==0){
            System.out.println("lies on y-axis");
        }
        else if(y==0){
            System.out.println("lies on x-axis");
        }
        else{
            System.out.println("not lies on any axis");
        }
    }
}
