package DoAn;

import java.io.*;

import java.util.Scanner;

public class lhthien {
	// Phép chia
    public static void divide(Scanner scanner) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        if (num2 != 0) {
            System.out.println("Result: " + (num1 / num2));
        } else {
            System.out.println("Error! Division by zero.");
        }
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
