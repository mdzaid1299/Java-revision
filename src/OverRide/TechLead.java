package OverRide;

public class TechLead extends Employee{
    public TechLead(String empName, float salary, float bonas) {
        super(empName, salary, bonas);
    }
@Override
    public float calculateSalary() {
    return super.calculateSalary();
    }
}
