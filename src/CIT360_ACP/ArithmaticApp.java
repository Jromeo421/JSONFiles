package CIT360_ACP;

import java.util.Scanner;

public class ArithmaticApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Scanner input = new Scanner(System.in);
            ControIt arith = new ControIt();
            Integer uIn1;
            Integer uIn2;
            String operand;
            
            System.out.println("Enter a number: ");
            uIn1 = Integer.parseInt(input.nextLine());
            
            System.out.println("Enter an operator (+, -, *, /, ^): ");
            operand = input.nextLine();
            
            System.out.println("Enter a number: ");
            uIn2 = Integer.parseInt(input.nextLine());
            
            System.out.println("Answer: ");
            
            ControIt.handleOperator(operand, uIn1, uIn2);
        } catch (NumberFormatException e) {
            System.out.println("\nOops, Please add a different numbers.\n");
            Scanner input = new Scanner(System.in);
            Integer uIn1;
            Integer uIn2;
            String operator;
            
            System.out.println("Enter a number: ");
            uIn1 = Integer.parseInt(input.nextLine());
            
            System.out.println("Enter an operator please: (+, -, *, /, ^): ");
            operator = input.nextLine();
            
            System.out.println("Enter a number: ");
            uIn2 = Integer.parseInt(input.nextLine());
            
            System.out.println("Answer: ");
            
            ControIt.handleOperator(operator, uIn1, uIn2);
        }
    }    
}