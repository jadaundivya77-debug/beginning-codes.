import java.util.Scanner;
public class Swap {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int temp,a, b;
        System.out.println("Enter a value: ");
        a=sc.nextInt();
        System.out.println("Enter b value: ");
        b=sc.nextInt();
        temp=a;
        a=b;
        b=temp;
        System.out.println("Value of a is: " + a + " b: " + b);


    }
    
}
