import java.util.Scanner;
public class YearlySalaryBonus {
    int empid,empworkingDays, experience;
    float empGrossSalary, empSalary, bonus, yearlyincrement;
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
        System.out.println("Enter Employee Experience: ");
        experience=sc.nextInt();
         
        }
        void CalculateGrossSalary(){
            yearlyincrement=(empSalary*6)/100;
            
            if(experience%5==0){
                //expSalary=(empSalary*1.5f)+ empSalary;
                bonus=empSalary*1.5f;
                 System.out.println("Salary with bonus: " + empSalary+bonus);
            }
            
            empGrossSalary=empSalary+yearlyincrement+bonus;

            
        }
        void DisplayDetails(){
            System.out.println(" Employee ID: " + empid );
            System.out.println(" Employee Name: " + empname);
            System.out.println(" Employee Salary: " + empSalary);
            System.out.println(" Employee Working Days: " + empworkingDays);
            System.out.println(" Employee Experience: " + experience);
            System.out.println(" Employee Gross Salary: " + empGrossSalary);
        }
    public static void main(String[] args) {
        DataMembers obj=new DataMembers();
        obj.GetData();
        obj.CalculateGrossSalary();
        obj.DisplayDetails();
    }
}
    

