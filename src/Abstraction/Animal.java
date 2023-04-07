package Abstraction;

public abstract class Animal {
    private String cat;

    public Animal(String cat) {
        this.cat = cat;
    }

    public abstract void makeSound();

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

}
