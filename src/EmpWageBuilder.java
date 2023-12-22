import java.util.*;

public class EmpWageBuilder implements InterfaceComputeEmpWage{

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int FULL_TIME_WORKING_HOURS = 8;
    public static final int PART_TIME_WORKING_HOURS = 4;
    
    private ArrayList<CompanyEmpWage> companies;
    private Map<String, CompanyEmpWage> companyNameToCompanyMap;

    EmpWageBuilder(){
        companies = new ArrayList<CompanyEmpWage>();
        companyNameToCompanyMap = new HashMap<>();
    }

    public int getWorkingHoursADay(int attendance, int totalEmpHours, int maxEmpHoursPerMonth)
    {
        int empHours = 0;

        switch(attendance){
                case IS_FULL_TIME:
                    if(totalEmpHours != maxEmpHoursPerMonth)
                    {
                        empHours = FULL_TIME_WORKING_HOURS;
                    }
                    break;
                case IS_PART_TIME:
                    if(totalEmpHours != maxEmpHoursPerMonth)
                    {
                        empHours = PART_TIME_WORKING_HOURS;
                    }
                    break;
                default:
                    empHours = 0;
        }

        return empHours;
    }

    public void calculateWage(CompanyEmpWage company)
    {
        int totalEmpHours = 0;

        int currDay = 1;
        while(currDay <= company.maxWorkingDays && totalEmpHours <= company.maxEmpHoursPerMonth)
        {
            int empHours = 0;
            int empWage = 0;

            int attendance = (int)(Math.floor(Math.random() * 3.0));

            empHours = getWorkingHoursADay(attendance, totalEmpHours, company.maxEmpHoursPerMonth);

            if(totalEmpHours + empHours > company.maxEmpHoursPerMonth)
            {
                empHours = company.maxEmpHoursPerMonth - totalEmpHours;
            }

            empWage = company.empRatePerHour * empHours;
            
            company.dailyWages.add(empWage);

            company.totalEmpWage += empWage;
            totalEmpHours += empHours;
            currDay++;
        }

        companyNameToCompanyMap.put(company.companyName, company);
    }

    public void addCompanyEmpWage(String companyName, int empRatePerHour, int maxEmpHoursPerMonth, int maxWorkingDays){
        
        CompanyEmpWage newCompanyEmpWage = new CompanyEmpWage(companyName, empRatePerHour, maxEmpHoursPerMonth, maxWorkingDays);
        companies.add(newCompanyEmpWage);
    }

    public void computeEmpWage(String companyName){
        System.out.println();
        if(companyNameToCompanyMap.containsKey(companyName) == false){
            System.out.println("Company Not Found !!");
        }else{
            System.out.println(companyNameToCompanyMap.get(companyName));
        }
    }

    public void computeEmpWage(){

        int totalCompanies = companies.size();

        if(totalCompanies == 0){
            System.out.println("No Companies Found !!");
            return;
        }

        for(int i = 0; i < totalCompanies; i++){
            calculateWage(companies.get(i));
        }
    }
}
