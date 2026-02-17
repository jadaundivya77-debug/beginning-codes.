import java.util.Scanner;
public class Square {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        float r,side,perimeter;
        System.out.println("Enter the Area of Circle: ");
        r=sc.nextFloat();
        side=(r)**(1.0f/2);
        System.out.println("Side of square: " + side);
        perimeter=side*4;
        System.out.println("Perimeter  of square: " + perimeter);

    }

    
}
