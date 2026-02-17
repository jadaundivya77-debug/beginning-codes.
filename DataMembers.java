import java.util.Scanner;
public class DataMembers {
    int empid,empworkingDays;
    float empGrossSalary, empSalary;
    String empname;
    Scanner sc=new Scanner(System.in);
    void GetData(){
        System.out.println("Enter Employee ID: ");
        empid=sc.nextInt();
        System.out.println("Enter Employee Name: ");
        empname=sc.next();
        System.out.println("Enter Employee Salary: ");
        empSalary=sc.nextFloat();
        System.out.println("Enter Employee WorkingDays: ");
        empworkingDays=sc.nextInt();
        }
        float CalculateGrossSalary(){
            empGrossSalary=((empSalary/30)*empworkingDays);
            return(empGrossSalary);
        }
        void DisplayDetails(){
            System.out.println(" Employee ID: " + empid );
            System.out.println(" Employee Name: " + empname);
            System.out.println(" Employee Salary: " + empSalary);
            System.out.println(" Employee Working Days: " + empworkingDays);
            System.out.println(" Employee Gross Salary: " + empGrossSalary);
        }
    public static void main(String[] args) {
        DataMembers obj=new DataMembers();
        obj.GetData();
        obj.CalculateGrossSalary();
        obj.DisplayDetails();
    }
}
