package AbstractLMS;

public class Manager extends Employee {

    @Override
    public double calculateSalary(float hikePercent) {
        return hikePercent * 400;
    }

    public static void main(String[] args) {
        Manager manager = new Manager();
        manager.over();
        System.out.println(manager.calculateSalary(8.7f));
        System.out.println(manager);
    }

}
