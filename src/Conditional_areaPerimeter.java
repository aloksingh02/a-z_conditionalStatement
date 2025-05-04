import java.util.Scanner;
public class Conditional_areaPerimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        float length = sc.nextFloat();
        System.out.println("Enter the breadth of rectangle");
        float breadth = sc.nextFloat();

        float area = length * breadth;
        float perimeter = 2*(length+breadth);

        if(area>perimeter){
            System.out.print("area is greater by: ");
            float size1 = area-perimeter;
            System.out.println(size1);
        }
        else if(perimeter > area){
            System.out.print("perimeter is greater by: ");
            float size2 = perimeter-area;
            System.out.println(size2);
        }
        else{
            System.out.println("both are equal");
        }
    }
}
