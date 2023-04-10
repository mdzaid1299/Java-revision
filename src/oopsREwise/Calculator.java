package oopsREwise;

import java.util.Scanner;

public class Calculator {

        int add (int a , int b ){
            return a + b;
        }
        int sub ( int b , int a){
            return a - b;
        }
        int mult (int a , int b){
            return a * b;
        }
        int divide (int a , int b ){
            return a /b ;
        }
        public static void main (String [] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter 2 integres");
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            Calculator c = new Calculator();
            int add = c.add(num1, num2);
            int sub = c.sub(num1, num2);
            int mul = c.mult(num1, num2);
            int div = c.divide(num1, num2);
            System.out.println("add :" + add);
            System.out.println("sub :" + sub);
            System.out.println("mul :"+mul);
            System.out.println("div :"+div);
        }
    }

