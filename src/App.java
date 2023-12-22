import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Employee Wage Computation.");

        EmpWageBuilder EmpWageBuilderArray = new EmpWageBuilder();
        
        EmpWageBuilderArray.addCompanyEmpWage("Apple", 16, 100, 20);
        EmpWageBuilderArray.addCompanyEmpWage("Microsoft", 20, 90, 18);
        EmpWageBuilderArray.addCompanyEmpWage("Google", 25, 80, 16);

        EmpWageBuilderArray.computeEmpWage();

        Scanner scannerObject = new Scanner(System.in);

        System.out.println("Enter the name of the company to display it's Total Wage: ");
        String queryCompany = scannerObject.next();

        EmpWageBuilderArray.computeEmpWage(queryCompany);

        scannerObject.close();
    }
}
