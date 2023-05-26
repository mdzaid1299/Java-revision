package Collection;

import oops.inheritance.aggregate.Address;

public class ComparableDemo implements Comparable<ComparableDemo>{
    private String name;
    private String street;
    private int zip;

    public ComparableDemo(String name, String street, int zip) {
        this.name = name;
        this.street = street;
        this.zip = zip;
    }

    @Override
    public int compareTo(ComparableDemo o) {
        if (this.zip == o.zip) {
            return 0;
        }
        if (this.zip < o.zip) {
            return -1;
        }

        return 1;
    }

    @Override
    public String toString() {
        return "ComparableDemo{" +
                "name='" + name + '\'' +
                ", street='" + street + '\'' +
                ", zip=" + zip +
                ", string='" + '\'' +
                '}';
    }

}
