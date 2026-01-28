import java.util.Scanner;
public class Sum {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a,b,result;
        System.out.println("Enter the number; ");
        a=sc.nextInt();
        System.out.println("Enter the number; ");
        b=sc.nextInt();
        result=a+b;
        System.out.println("The sum is; " + result);
    }
    
}
