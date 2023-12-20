public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Employee Wage Computation.");

        int IS_PRESENT = 1;
        int EMP_RATE_PER_HOUR = 20;
        int FULL_DAY_WORKING_HOURS = 8;

        int attendance = (int)(Math.floor(Math.random() * 2.0));
        
        int empHours = 0;
        int empWage = 0;

        if(attendance == IS_PRESENT){
            System.out.println("Employee is present.");
            empHours = FULL_DAY_WORKING_HOURS;
        }
        else{
            System.out.println("Employee is absent.");
            empHours = 0;
        }

        empWage = EMP_RATE_PER_HOUR * empHours;

        System.out.println("Employee Wage for the day is: " + empWage);

    }
}
