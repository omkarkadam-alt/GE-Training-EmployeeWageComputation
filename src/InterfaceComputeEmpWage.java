public interface InterfaceComputeEmpWage{
    public int getWorkingHoursADay(int attendance, int totalEmpHours, int maxEmpHoursPerMonth);
    public void calculateWage(CompanyEmpWage company);
    public void addCompanyEmpWage(String companyName, int empRatePerHour, int maxEmpHoursPerMonth, int maxWorkingDays);
    public void computeEmpWage();
}
