package oops.inheritance.aggregate;

public class AggregateRelation {
    public static void main(String[] args) {

        Address address = new Address("s12","kol","wb","Ind",22424);
        Employee employee = new Employee(12,"Nil","nig@gnam",address);
        System.out.println(employee);
    }
}
