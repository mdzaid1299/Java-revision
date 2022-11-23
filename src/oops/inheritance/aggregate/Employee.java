package oops.inheritance.aggregate;

public class Employee {
    int employeeId;
    String employeeName;
    String employeeEmail;
    Address address;
    public Employee(int employeeId,String employeeName,String employeeEmail,Address address){
       this.employeeId = employeeId;
       this.employeeName = employeeName;
       this.employeeEmail = employeeEmail;
       this.address = address;
    }

    @Override
    public String toString() {

        return "Employee{" +
                "employeeId=" + employeeId +
                ", employeeName='" + employeeName + '\'' +
                ", employeeEmail='" + employeeEmail + '\'' +
                ", address=" + address +
                '}';
    }
}
