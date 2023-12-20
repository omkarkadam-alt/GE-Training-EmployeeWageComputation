public class App {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int FULL_TIME_WORKING_HOURS = 8;
    public static final int PART_TIME_WORKING_HOURS = 4;
    public static final int WORKING_DAYS_PER_MONTH = 20;
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Employee Wage Computation.");

        int totalEmpWage = 0;
        int totalEmpHours = 0;

        int fullTimeDaysWorked = 0;
        int partTimeDaysWorked = 0;

        for(int currDay = 1; currDay <= WORKING_DAYS_PER_MONTH; currDay++)
        {
            int empHours = 0;
            int empWage = 0;

            int attendance = (int)(Math.floor(Math.random() * 3.0));

            switch(attendance){
                case IS_FULL_TIME:
                    // System.out.println("Employee is working full time.");
                    empHours = FULL_TIME_WORKING_HOURS;
                    fullTimeDaysWorked++;
                    break;
                case IS_PART_TIME:
                    // System.out.println("Employee is working part time.");
                    empHours = PART_TIME_WORKING_HOURS;
                    partTimeDaysWorked++;
                    break;
                default:
                    // System.out.println("Employee is on leave.");
                    empHours = 0;
            }

            empWage = EMP_RATE_PER_HOUR * empHours;
            totalEmpWage += empWage;
            totalEmpHours += empHours;
        }

        System.out.println("Full Time: " + fullTimeDaysWorked + " Days");
        System.out.println("Part Time: " + partTimeDaysWorked + " Days");
        System.out.println("Employee Wage for the month: " + totalEmpWage);

    }
}
