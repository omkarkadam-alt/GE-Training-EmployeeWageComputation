public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Employee Wage Computation.");
        
        String company1Name = "Apple";
        int empRatePerHourCompany1 = 20, daysPerMonthCompany1 = 20, maxEmpHoursCompany1 = 100;
        EmpWageBuilder company1 = new EmpWageBuilder(company1Name, empRatePerHourCompany1, maxEmpHoursCompany1, daysPerMonthCompany1);

        company1.calculateWage();
        System.out.println(company1);

        String company2Name = "Microsoft";
        int empRatePerHourCompany2 = 15, daysPerMonthCompany2 = 18, maxEmpHoursCompany2 = 80;
        EmpWageBuilder company2 = new EmpWageBuilder(company2Name, empRatePerHourCompany2, maxEmpHoursCompany2, daysPerMonthCompany2);
        
        company2.calculateWage();
        System.out.println(company2);
    }
}
