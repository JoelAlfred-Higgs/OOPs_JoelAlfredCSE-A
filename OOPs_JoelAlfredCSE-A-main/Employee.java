import java.util.Scanner;
class EmployeeSalary {
    int base;
    EmployeeSalary(int base){
        this.base = base;
    }
    public void salaryCalc(){
        double hra = base*(0.15);
        double da = base*(0.05);
        double pf = base*(0.11);
        double loan = base*(0.2);
        double Salary = base + (hra+da) - (pf+loan);
        System.out.println("Salary: $"+Salary);
                                                                                                                                                                              
    }
    }
public class Employee{
    public static void main(String[] args) {
        int basepay,i,n;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter no of employees: ");
        n = obj.nextInt();
        for(i=1;i<=n;i++){
            System.out.print("Enter Basic pay of employee "+i+" :");
            basepay = obj.nextInt();
            EmployeeSalary emp = new EmployeeSalary(basepay);
            emp.salaryCalc();
        }
        obj.close();
        
    }
}
