import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        float R, Area;
        
        System.out.println("Enter the radius of the Circle: ");
        R=sc.nextInt();
        Area=3.14f*(R*R);
        System.out.println("Area of the Circle: " + Area);

    }
    
}
