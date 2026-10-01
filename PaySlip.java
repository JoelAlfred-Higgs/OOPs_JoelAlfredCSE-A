import java.util.Scanner;
class Employee{
    String empname,empid,designation;
    int BasicPay;
    double Gross_pay,net_pay,loan,da,hra;
    static String CompanyName = "Porter Bridges";
    static double hra_rate = 0.15,da_rate = 0.08;
    Employee(String empname,String empid,String designation,double loan,int BasicPay){
        this.empname = empname;
        this.empid = empid;
        this.BasicPay = BasicPay;
        this.designation = designation;
        this.hra = BasicPay*hra_rate;
        this.da = BasicPay*da_rate;
        this.loan = loan;
        this.Gross_pay = (BasicPay+hra+da);
        this.net_pay = Gross_pay - loan;
    }
    
    void payslipGenerator(){
    System.out.println("==================================================");
    System.out.println("                  PAYSLIP");
    System.out.println("==================================================");
    System.out.println(" Employee Name   : " + empname);
    System.out.println(" Employee ID     : " + empid);
    System.out.println(" Designation     : " + designation);
    System.out.println("--------------------------------------------------");
    System.out.println(" Basic Pay       : "+ BasicPay);
    System.out.println(" House Rent Allowance(HRA)        :"+ hra);
    System.out.println(" Dearness Allowance (DA)          :"+ da);
    System.out.println("--------------------------------------------------");
    System.out.println(" Gross Pay          :  "+ Gross_pay);
    System.out.println(" Loan Deduction     :"+ loan);
    System.out.println("--------------------------------------------------");
    System.out.println(" Net Pay            :"+ net_pay);
    System.out.println("==================================================");
}
}
    

class Programmer extends Employee{
    Programmer(String empname,String empid,double loan,int BasicPay){
    super(empname,empid,"Programmer",loan,BasicPay);}

}
class AssistantProfessor extends Employee{
    AssistantProfessor(String empname,String empid,double loan,int BasicPay){
    super(empname,empid,"Assistant Professor",loan,BasicPay);}

}
class AssociateProfessor extends Employee{
    AssociateProfessor(String empname,String empid,double loan,int BasicPay){
    super(empname,empid,"Associate Professor",loan,BasicPay);}

}
class Professor extends Employee{
    Professor(String empname,String empid,double loan,int BasicPay){
    super(empname,empid,"Professor",loan,BasicPay);}

}
public class PaySlip{   
     public static void main(String[] args){
        int choice,basic;
        char ch;
        String name,id;
        double loan;
        Scanner obj = new Scanner(System.in);
        do{
            System.out.print("Employee Name: ");
            name = obj.nextLine();
            System.out.print("Employee ID: ");
            id = obj.nextLine();
            System.out.print("Enter BasicPay and Loan(If availed): ");
            basic = obj.nextInt();
            loan =  obj.nextDouble();
            System.out.print("Enter Designation No: \n1.Programmer\n2.Assistant professor\n3.Associate Professor\n4.Professor\n");
            choice = obj.nextInt();
            obj.nextLine();
            switch(choice){
                case 1:
                    Programmer prog = new Programmer(name,id,loan,basic);
                    prog.payslipGenerator();
                    break;
                case 2:
                    AssistantProfessor assist= new AssistantProfessor(name,id,loan,basic);
                    assist.payslipGenerator();
                    break;
                case 3:
                    AssociateProfessor asso= new AssociateProfessor(name,id,loan,basic);
                    asso.payslipGenerator();
                    break;
                case 4:
                    Professor prof = new Professor(name,id,loan,basic);
                    prof.payslipGenerator();
                    break;
                default:
                    System.out.print("Designation is not available!");
            }
            System.out.print("Generate PaySlip(y/n): ");
            ch = obj.next().charAt(0);
        
     }while(ch=='Y'||ch=='y');
     obj.close();
}}
