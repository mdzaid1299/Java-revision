package AbstractLMS;

public abstract class Employee {
    private String employeeName;
    private String EmployeeCode;
    private String dob;

    public abstract double calculateSalary(float hikePercent);

    public void over() {
        System.out.println("it over now");
    }
}
