package OverRide;

public class SalesManager extends Employee{
    float commition;

    public SalesManager(float commition,String empName, float salary, float bonas) {
        super(empName, salary, bonas);
        this.commition = commition;
    }

    @Override
    public float calculateSalary() {
        return super.calculateSalary() + commition;
    }
}
