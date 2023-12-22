public class CompanyEmpWage {
    public final String companyName;
    public final int empRatePerHour;
    public final int maxEmpHoursPerMonth;
    public final int maxWorkingDays;
    public int totalEmpWage;

    CompanyEmpWage(String companyName, int empRatePerHour, int maxEmpHoursPerMonth, int maxWorkingDays){
        this.companyName = companyName;
        this.empRatePerHour = empRatePerHour;
        this.maxEmpHoursPerMonth = maxEmpHoursPerMonth;
        this.maxWorkingDays = maxWorkingDays;
        this.totalEmpWage = 0;
    }

    @Override
    public String toString(){
        return "Total Emp Wage for Company: " + companyName + " is: " + totalEmpWage;
    }
}
