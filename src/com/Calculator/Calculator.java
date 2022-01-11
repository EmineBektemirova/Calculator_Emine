package com.Calculator;

//import com.sun.source.tree.CaseTree;

import java.util.InputMismatchException;
import java.util.Scanner;

//import sun.jvm.hotspot.debugger.UnalignedAddressException;

public class Calculator {
    private String operation;
    private Scanner scanner;

    public Calculator() {
        this.scanner = new Scanner(System.in);
    }

    public void calculate() {
        while (!"q".equals(operation)) {
            try {
                System.out.println(calculationStep());
            } catch (InputMismatchException ex) {
                System.out.println("Wrong input data!");
            }
        }
    }

    private double calculationStep() throws InputMismatchException {5

        System.out.println("enter first number:");
        double firstNumber = Double.parseDouble(scanner.nextLine());
        System.out.println("enter second number:");
        double secondNumber = Double.parseDouble(scanner.nextLine());
        System.out.println("enter operation (only '+ - * /' is available) to perform or q if you want to quit:");


        operation = scanner.nextLine();


        return performOperation(firstNumber, secondNumber);

    }

    private double performOperation(double firstNumber, double secondNumber) {
        double result;

        switch (operation) {
            case "+":
                result = plus(firstNumber, secondNumber);
                break;
            case "-":
                result = minus(firstNumber, secondNumber);
                break;
            case "*":
                result = multiply(firstNumber, secondNumber);
                break;
            case "/":
                result = division(firstNumber, secondNumber);
                break;
            default:
                throw new UnsupportedOperationException(String.format("The operation '%s' is not supported", operation));
        }

        return result;
    }

    private double plus(double numberOne, double numberTwo) {
        return numberOne + numberTwo;
    }

    private double minus(double numberOne, double numberTwo) {
        return numberOne - numberTwo;
    }

    private double multiply(double numberOne, double numberTwo) {
        return numberOne * numberTwo;
    }

    private double division(double numberOne, double numberTwo) {
        return numberOne / numberTwo;
    }

}