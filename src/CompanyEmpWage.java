import java.util.ArrayList;

public class CompanyEmpWage {
    public final String companyName;
    public final int empRatePerHour;
    public final int maxEmpHoursPerMonth;
    public final int maxWorkingDays;
    public int totalEmpWage;
    public ArrayList<Integer> dailyWages;

    CompanyEmpWage(String companyName, int empRatePerHour, int maxEmpHoursPerMonth, int maxWorkingDays){
        this.companyName = companyName;
        this.empRatePerHour = empRatePerHour;
        this.maxEmpHoursPerMonth = maxEmpHoursPerMonth;
        this.maxWorkingDays = maxWorkingDays;
        this.totalEmpWage = 0;
        this.dailyWages = new ArrayList<Integer>();
    }

    @Override
    public String toString(){

        System.out.println("For " + companyName + ": ");
        for(int i = 1; i <= dailyWages.size(); i++)
        {
            System.out.println("Daily Wage for Day " + i + ": " + dailyWages.get(i-1));
        }
        return "Total Emp Wage for Company: " + companyName + " is: " + totalEmpWage;

    }
}
