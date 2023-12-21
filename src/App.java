public class App {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int FULL_TIME_WORKING_HOURS = 8;
    public static final int PART_TIME_WORKING_HOURS = 4;

    static int getWorkingHoursADay(int attendance, int totalEmpHours, int maxEmpHours)
    {
        int empHours = 0;

        switch(attendance){
                case IS_FULL_TIME:
                    if(totalEmpHours != maxEmpHours)
                    {
                        empHours = FULL_TIME_WORKING_HOURS;
                    }
                    break;
                case IS_PART_TIME:
                    if(totalEmpHours != maxEmpHours)
                    {
                        empHours = PART_TIME_WORKING_HOURS;
                    }
                    break;
                default:
                    empHours = 0;
        }

        return empHours;
    }

    static int calculateWage(int empRatePerHour, int daysPerMonth, int maxEmpHours)
    {
        int totalEmpWage = 0;
        int totalEmpHours = 0;

        int currDay = 1;
        while(currDay <= daysPerMonth && totalEmpHours <= maxEmpHours)
        {
            int empHours = 0;
            int empWage = 0;

            int attendance = (int)(Math.floor(Math.random() * 3.0));

            empHours = getWorkingHoursADay(attendance, totalEmpHours, maxEmpHours);

            if(totalEmpHours + empHours > maxEmpHours)
            {
                empHours = maxEmpHours - totalEmpHours;
            }

            empWage = empRatePerHour * empHours;
            totalEmpWage += empWage;
            totalEmpHours += empHours;
            currDay++;
        }

        System.out.println("Hours Worked: " + totalEmpHours);
        System.out.println("Employee Wage for the month: " + totalEmpWage);

        return totalEmpWage;
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Employee Wage Computation.");
        
        int empRatePerHourCompany1 = 20, daysPerMonthCompany1 = 20, maxEmpHoursCompany1 = 100;
        System.out.println("For Company 1: ");
        calculateWage(empRatePerHourCompany1, daysPerMonthCompany1, maxEmpHoursCompany1);
        System.out.println();

        int empRatePerHourCompany2 = 15, daysPerMonthCompany2 = 18, maxEmpHoursCompany2 = 80;
        System.out.println("For Company 2: ");
        calculateWage(empRatePerHourCompany2, daysPerMonthCompany2, maxEmpHoursCompany2);
        System.out.println();
    }
}
