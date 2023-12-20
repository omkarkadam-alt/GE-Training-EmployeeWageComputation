public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Employee Wage Computation.");

        int IS_PRESENT = 1;
        int attendance = (int)(Math.floor(Math.random() * 2.0));
        

        if(attendance == IS_PRESENT){
            System.out.println("Employee is present.");
        }
        else{
            System.out.println("Employee is absent.");
        }
    }
}
