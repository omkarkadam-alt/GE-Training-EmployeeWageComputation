public class EmpWageBuilder {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int FULL_TIME_WORKING_HOURS = 8;
    public static final int PART_TIME_WORKING_HOURS = 4;

    private final String companyName;
    private final int empRatePerHour;
    private final int maxEmpHoursPerMonth;
    private final int maxWorkingDays;
    private int totalEmpWage;

    EmpWageBuilder(String companyName, int empRatePerHour, int maxEmpHoursPerMonth, int maxWorkingDays){
        this.companyName = companyName;
        this.empRatePerHour = empRatePerHour;
        this.maxEmpHoursPerMonth = maxEmpHoursPerMonth;
        this.maxWorkingDays = maxWorkingDays;
        this.totalEmpWage = 0;
    }

    int getWorkingHoursADay(int attendance, int totalEmpHours)
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

    public void calculateWage()
    {
        int totalEmpHours = 0;

        int currDay = 1;
        while(currDay <= maxWorkingDays && totalEmpHours <= maxEmpHoursPerMonth)
        {
            int empHours = 0;
            int empWage = 0;

            int attendance = (int)(Math.floor(Math.random() * 3.0));

            empHours = getWorkingHoursADay(attendance, totalEmpHours);

            if(totalEmpHours + empHours > maxEmpHoursPerMonth)
            {
                empHours = maxEmpHoursPerMonth - totalEmpHours;
            }

            empWage = empRatePerHour * empHours;
            totalEmpWage += empWage;
            totalEmpHours += empHours;
            currDay++;
        }
    }

    @Override
    public String toString(){
        return "Total Emp Wage for Company: " + companyName + " is: " + totalEmpWage;
    }

    
}
