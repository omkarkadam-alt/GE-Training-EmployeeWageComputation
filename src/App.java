public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Employee Wage Computation.");

        int IS_PART_TIME = 1;
        int IS_FULL_TIME = 2;
        int EMP_RATE_PER_HOUR = 20;
        int FULL_TIME_WORKING_HOURS = 8;
        int PART_TIME_WORKING_HOURS = 4;

        int attendance = (int)(Math.floor(Math.random() * 3.0));
        
        int empHours = 0;
        int empWage = 0;

        if(attendance == IS_FULL_TIME){
            System.out.println("Employee is working full time.");
            empHours = FULL_TIME_WORKING_HOURS;
        }
        else{
            if(attendance == IS_PART_TIME){
                System.out.println("Employee is working part time.");
                empHours = PART_TIME_WORKING_HOURS;
            }
            else{
                System.out.println("Employee is on leave.");
                empHours = 0;
            }
        }

        empWage = EMP_RATE_PER_HOUR * empHours;

        System.out.println("Employee Wage for the day is: " + empWage);

    }
}
