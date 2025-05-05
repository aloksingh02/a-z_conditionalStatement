import java.util.Scanner;
public class Conditional_yongestAmongThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of ram:");
        int ram = sc.nextInt();
        System.out.println("Enter the age of raju:");
        int raju = sc.nextInt();
        System.out.println("Enter the age of shyam:");
        int shyam = sc.nextInt();

        if(ram<raju && ram<shyam){
            System.out.println("ram is youngest: "+ram);
        }

        else if(raju<ram && raju<shyam){
            System.out.println("raju is youngest"+raju);
        }
        else{
            System.out.println("shyam is youngest"+shyam);
        }
    }
}
