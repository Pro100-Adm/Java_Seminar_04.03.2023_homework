/*
Вычислить n-ое треугольного число(сумма чисел от 1 до n), а так же n! (произведение чисел от 1 до n)
*/

import java.util.Scanner;


public class task_1 {

    public static void main(String[] args) {
        int number = userInput();
        int summ = 0;
        for (int i = 0; i <= number; i++) {
                summ += i;
        }
        System.out.printf("Summ of numbers from 1 to %d is %d.", number, summ);
        System.out.println();
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *=i;
        }
        System.out.printf("Factorial of %d is %d.", number, factorial);
        }

    public static int userInput(){
        Scanner numberInput = new Scanner(System.in);
        System.out.print("Enter number: ");
        String userInput = numberInput.nextLine();
        try {
            int number = Integer.parseInt(userInput);
            numberInput.close();
            return number;
        } catch (Exception e) {
            System.out.println("Wrong number!");
            return userInput();
        }
    }   
}