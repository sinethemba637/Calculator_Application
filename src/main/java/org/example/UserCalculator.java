package org.example;
import java.util.Scanner;

public class UserCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double result;
        System.out.println("Enter number:");
        int num1 = Integer.parseInt(input.nextLine());


        System.out.println("Enter the operator:");
        String operator=  input.next();



        System.out.println("Enter another number :");
        int num2 = input.nextInt();


        UserCalculator calc =new UserCalculator();
        result=calc.Operators(num1,operator,num2);
        System.out.println("result"+" "+ result);

    }



        public double Operators(double num1, String operation, double num2) {
            switch (operation) {
                case "divide":
                    return num1 / num2;
                case "multiplication":
                    return num1 * num2;
                case "addition":
                    return num1 + num2;
                case "subtraction":
                    return num1 - num2;
                default:
                    throw new IllegalArgumentException("Invalid operation: " + operation);
            }
        }
    }
