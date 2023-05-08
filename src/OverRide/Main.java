package OverRide;

public class Main {
    public static void main(String[] args) {
        Employee employee = new SalesManager(89f, "bobit", 600000f, 700f);
        float salesmanagersalary = employee.calculateSalary();
        System.out.println("salesmanagersalary" + salesmanagersalary);
        Employee employee1 = new TechLead("Johnny", 540f, 988f);
        System.out.println(employee1.calculateSalary());
    }
}
