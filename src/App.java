public class App {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int FULL_TIME_WORKING_HOURS = 8;
    public static final int PART_TIME_WORKING_HOURS = 4;
    public static final int WORKING_DAYS_PER_MONTH = 20;
    public static final int MAX_HRS_IN_MONTH = 100;

    int totalEmpWage = 0;
    int totalEmpHours = 0;

    int fullTimeDaysWorked = 0;
    int partTimeDaysWorked = 0;

    int getWorkingHoursADay(int attendance, int totalEmpHours)
    {
        int empHours = 0;

        switch(attendance){
                case IS_FULL_TIME:
                    if(totalEmpHours != MAX_HRS_IN_MONTH)
                    {
                        empHours = FULL_TIME_WORKING_HOURS;
                        (fullTimeDaysWorked)++;
                    }
                    break;
                case IS_PART_TIME:
                    if(totalEmpHours != MAX_HRS_IN_MONTH)
                    {
                        empHours = PART_TIME_WORKING_HOURS;
                        (partTimeDaysWorked)++;
                    }
                    break;
                default:
                    empHours = 0;
        }

        return empHours;
    }

    void calculateWage()
    {
        int currDay = 1;
        while(currDay <= WORKING_DAYS_PER_MONTH && totalEmpHours <= MAX_HRS_IN_MONTH)
        {
            int empHours = 0;
            int empWage = 0;

            int attendance = (int)(Math.floor(Math.random() * 3.0));

            empHours = getWorkingHoursADay(attendance, totalEmpHours);

            if(totalEmpHours + empHours > MAX_HRS_IN_MONTH)
            {
                empHours = MAX_HRS_IN_MONTH - totalEmpHours;
            }

            empWage = EMP_RATE_PER_HOUR * empHours;
            totalEmpWage += empWage;
            totalEmpHours += empHours;
            currDay++;
        }

        System.out.println("Full Time: " + fullTimeDaysWorked + " Days");
        System.out.println("Part Time: " + partTimeDaysWorked + " Days");
        System.out.println("Hours Worked: " + totalEmpHours);
        System.out.println("Employee Wage for the month: " + totalEmpWage);
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Employee Wage Computation.");

        App mainObj = new App();

        mainObj.calculateWage();

    }
}
