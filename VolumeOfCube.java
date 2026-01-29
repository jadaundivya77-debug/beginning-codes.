import java.util.Scanner;
public class VolumeOfCube {
    public static void main(String[]args){

    
    Scanner sc= new Scanner(System.in);
    float r,h,volume;
    System.out.println("Enter the radius of Cube: ");
    r=sc.nextFloat();
    System.out.println("Enter the height of Cube: ");
    h=sc.nextFloat();
    volume=3.14f*(r*r)*h;
    System.out.println("Volume of cube: " + volume);


    }
    
}
