package oops.polymorphism;

public class MethodOverloading {
    public int add(int num1){
        return num1;
    }
    public int add(int num,int num1){
        return num+num1;
    }
    public double add(int num,double num1){
        return num+num1;
    }
    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        System.out.println(methodOverloading.add(22));
        System.out.println(methodOverloading.add(1, 4));
        System.out.println(methodOverloading.add(1, 11.55));

    }
}
