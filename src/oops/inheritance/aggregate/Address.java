package oops.inheritance.aggregate;

public class Address {
    String street;
    String city;
    String state;
    String country;
    int pinCode;
    public Address(String street, String city, String state, String country, int pinCode){
        this.street = street;
        this.city = city;
        this.state = state;
        this.country = country;
        this.pinCode = pinCode;
    }

    @Override
    public String toString() {

        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }
}
