/**
 Реализовать простой калькулятор (+ - / *)
 */
import java.util.Scanner;

 public class task_3 {

    public static void main(String[] args) {
        calc();
    }

    public static void
     calc(){
        char operator = operatorUserInput();
        int operand_1 = operandUserInput();
        int operand_2 = operandUserInput();
        if (operator=='+') System.out.print(operand_1+operand_2);
        if (operator=='-') System.out.print(operand_1-operand_2);
        if (operator=='*') System.out.print(operand_1*operand_2);
        if (operator=='/'){
            try {
                System.out.print((float) operand_1/operand_2);                
            } catch (Exception e) {
                System.out.println("Division error!");
                calc();
            }
        }
    }

    public static int operandUserInput(){
        Scanner operandInput = new Scanner(System.in);
        System.out.print("Enter operand: ");
        String operand = operandInput.nextLine();
        try {
            int number = Integer.parseInt(operand);
            return number;
        } catch (Exception e) {
            System.out.println("Wrong operand!");
            return operandUserInput();
        }
    }
    
    public static char operatorUserInput(){
        Scanner operatorInput = new Scanner(System.in);
        System.out.print("Enter operator: ");
        char operator = operatorInput.nextLine().charAt(0);
        try {
            if(operator=='+' | operator=='-' | operator=='*' | operator=='/'){
                return operator;
            }
            else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println(" Wrong operator!");
            return operatorUserInput();
        }
    }
}

