import java.util.Scanner;
public class Conditional_percentageCategories {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the marks");
        int marks = sc.nextInt();
        if(marks>=90){
            System.out.println("excellent");
        }
        else if(marks>=80){
            System.out.println("very good");
        }
        else if(marks>=80){
            System.out.println("very good");
        }
        else if(marks>=70){
            System.out.println("good");
        }
        else if(marks>=60){
            System.out.println("fair");
        }
        else if(marks>=50){
            System.out.println("average");
        }
        else{
            System.out.println("poor");
        }

    }
}
