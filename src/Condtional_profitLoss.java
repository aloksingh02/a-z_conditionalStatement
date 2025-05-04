import java.sql.SQLOutput;
import java.util.Scanner;
public class Condtional_profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the CP");
        int CP = sc.nextInt();
        System.out.println("Enter the SP");
        int SP = sc.nextInt();

        if(CP>SP){
            System.out.print("He will face lose: ");
            int lose = CP - SP;
            System.out.println(lose);
        }
        else{
            System.out.print("he will have profit: ");
            int profit = SP - CP;
            System.out.println(profit);
        }

    }
}
