import java.util.Scanner;
public class UserInput {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Roll number; ");
        int Roll_Number=sc.nextInt();
        System.out.println("Enter your Gender; ");
        char Gender =sc.next().charAt(0);
        sc.nextLine();
        System.out.println("Enter your Marks ; ");
        float Marks=sc.nextFloat();
        System.out.println("Enter your Name ; ");
        String Name=sc.next();
        System.out.println(" Name : "+Name + " Gender: " +Gender);


    }
    
}
