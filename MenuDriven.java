import java.util.Scanner;
public class MenuDriven {
    public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    float Area, l, b, r, side;
    float PI=3.14f;
    int options;
    char ch='y';
    do{
           System.out.println("/t/t Welcom to Menu Driven program for Area calculation.");
    System.out.println("1. Area of Circle");
    System.out.println("2. Area of Rectangle");
    System.out.println("3. Area of Square");
    System.out.println("Enter your options.");
    options=sc.nextInt();
    {
    switch(options){
        case 1:
    System.out.println("Enter the radius of the Circle.");
    r=sc.nextFloat();
    Area=PI*r*r;
    System.out.println("Area of circle: "+ Area);
    break;
    
        
    
    case 2:
        System.out.println("Enter the lenght and breadth of the Rectangle.");
        l=sc.nextFloat();
        b=sc.nextFloat();
        Area=l*b;
        
        System.out.println("Area of Rectangle: " + Area);
    break;
    case 3:
        System.out.println("Enter the Side of the Square.");
        side=sc.nextFloat();
        Area=side*side;
        System.out.println("Area of Square is: " + Area);


    break;
    default:
        System.out.println("Invalid Options");

    }
    System.out.println("Do you want to Continue?");
    ch=sc.next().charAt(0);
    
   
    }
     
 }while(ch=='y');
}

}