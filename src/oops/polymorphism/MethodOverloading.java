package oops.polymorphism;

public class MethodOverloading {
    public int iphoneCamera(int camera1){
        return 1;
    }
    public int iphoneCamera(int camera1,int camera2){
        return 2;
    }
    public int iphoneCamera(int camera1,double camera2){
        return 2;
    }
    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        System.out.println(methodOverloading.iphoneCamera(1));
        System.out.println(methodOverloading.iphoneCamera(1, 4));
        System.out.println(methodOverloading.iphoneCamera(1, 11));

    }
}
