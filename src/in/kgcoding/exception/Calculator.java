package in.kgcoding.exception;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Divison calculator\n");
        System.out.println("Please enter two numbers = ");
        int first = sc.nextInt();
        int second = sc.nextInt();

        try {
            int[] a = new int[6];
           // System.out.printf("Result is %d", a[7]);
            a[7] = first / second;
            System.out.printf("Result is %d", a[7]);
        } catch (ArithmeticException exception ){
           // System.out.println("Divide by zero, enter valid values");
            System.out.printf("%s, enter valid values",exception.getMessage());
        }catch (Throwable th){
            System.out.println("General Exception");
        }
    }
}
