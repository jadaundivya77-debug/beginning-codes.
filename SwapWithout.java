import java.util.Scanner;
public class SwapWithout {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int a,b;
    System.out.println("Enter a value: ");
    a=sc.nextInt();
    System.out.println("Enter b value: ");
    b=sc.nextInt();
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println(" a : " + a + " b: " + b);
    
    }
}
