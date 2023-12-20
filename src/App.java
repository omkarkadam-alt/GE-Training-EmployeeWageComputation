public class App {

    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    public static final int EMP_RATE_PER_HOUR = 20;
    public static final int FULL_TIME_WORKING_HOURS = 8;
    public static final int PART_TIME_WORKING_HOURS = 4;
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Employee Wage Computation.");

        int attendance = (int)(Math.floor(Math.random() * 3.0));
        
        int empHours = 0;
        int empWage = 0;

        switch(attendance){
            case IS_FULL_TIME:
                System.out.println("Employee is working full time.");
                empHours = FULL_TIME_WORKING_HOURS;
                break;
            case IS_PART_TIME:
                System.out.println("Employee is working part time.");
                empHours = PART_TIME_WORKING_HOURS;
                break;
            default:
                System.out.println("Employee is on leave.");
                empHours = 0;
        }

        empWage = EMP_RATE_PER_HOUR * empHours;

        System.out.println("Employee Wage for the day is: " + empWage);

    }
}
