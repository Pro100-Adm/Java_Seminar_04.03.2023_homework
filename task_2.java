/*
Вывести все простые числа от 1 до 1000
*/

public class task_2 {
    public static void main(String[] args) {
        int number = 1000;
        System.out.printf("Prime numbers from 1 to %d: ", number);
        for (int i = 1; i <= number; i++) {
            if (Prime(i)) System.out.printf("%d ", i);
        }
    }
 

    public static boolean Prime(int number){
        for (int j = 2; j <= Math.sqrt(number); j++) {
            if (number%j==0) return false;    
        }
        return true;  
    }
}