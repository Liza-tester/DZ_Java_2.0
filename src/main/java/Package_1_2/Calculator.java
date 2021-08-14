package Package_1_2;

import java.util.Scanner;
public class Calculator {

    /**
     * Метод позволяет складывать,вычитать, делить и умножать 2 дробных числа
     * @author Воробьева Е. Д.
     */
    public static void count() {
        Scanner scan = new Scanner(System.in);
        /*
        Var1 - первое число
        Var2 - второе число
        Operation - математическая операция над числами (+, -, /, *)
         */
        System.out.println("Введите первое число");
        double Var1 = scan.nextDouble();
        System.out.println("Выберите операцию ( +, -, /, * )");
        String Operation = scan.next();
        System.out.println("Введите второе число");
        double Var2 = scan.nextDouble();
        scan.close();
        // Result - результат вычисления

        double Result = 0;
        switch (Operation){
            case "+":
                Result = Var1 + Var2;
                break;
            case "-":
                Result = Var1 - Var2;
                break;
            case "/":
                Result = Var1 / Var2;
                break;
            case "*":
                Result = Var1 * Var2;
                break;
            default:
                break;
        }
        System.out.printf("= %.4f", Result);
    }
}
