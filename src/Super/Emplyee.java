package Super;

public class Emplyee {
    private String empName;
    private String empCode;
    private String dob;
    private int age;
    private double salary;

    public Emplyee(String empCode, String empName, String dob, int age, double salary) {
        this.age = age;
        this.empCode = empCode;
        this.dob = dob;
        this.empName = empName;
        this.salary = salary;
    }
}
