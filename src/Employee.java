public class Employee {

    private int employeeId;
    private String employeeName;
    private double salary;
    private double netSalary;

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setNetSalary(double netSalary) {
        this.netSalary = netSalary;

    }


    public double getSalary() {
        return salary;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public int getEmployeeId() {
        return employeeId;
    }


    public void calculateNetSalary(int pfPercentage) {
        double i = (pfPercentage*getSalary())/100;
        setNetSalary(getSalary()-i);
        System.out.println("net salary is " + getNetSalary());

    }

    public double getNetSalary() {
        return netSalary;
    }
}