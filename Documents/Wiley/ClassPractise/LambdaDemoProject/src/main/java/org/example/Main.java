package org.example;

@FunctionalInterface
interface Operation {
    public void perform(int number1, int number2);
}

public class Main {
    public static void main(String[] args) {
//		Operation sum=new Operation() {
//			@Override
//			public void perform(int number1, int number2) {
//				System.out.println("Sum "+(number1+number2));
//			}
//		};

        // Addition
        Operation sum =(number1,number2)-> System.out.println("Sum " + (number1 + number2));
        sum.perform(10, 20);

        // Multiplication
        Operation product =(number1,number2)-> System.out.println("Product : " + (number1 * number2));
        product.perform(10, 20);

        // Subtraction
        Operation subtract = ((number1, number2) -> System.out.println("Subtraction : " + (number1 - number2)));
        subtract.perform(20, 10);
    }
}