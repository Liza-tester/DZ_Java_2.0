package Packedge_7;

import java.util.NoSuchElementException;

public class ExDemonstration {
    private static void getResultWithTryCatch( ExOOPCalculator calc) {
        System.out.printf("(%.4f) %s (%.4f)", calc.getVar1(), calc.getOperation(), calc.getVar2());
        try {
            System.out.printf("= (%.4f)", calc.getResult());
        } catch (ArithmeticException e1) {
            System.err.println("\nERROR: " + e1 + " Деление на 0");
        } catch (NoSuchElementException e2) {
            System.err.println("\nERROR: " + e2 + " Недопустимый оператор");
        } catch (NullPointerException e3) {
            System.err.println("\nERROR: " + e3 + " Отсутствуют переменные или оператор");
        }
    }
    public static void ExOOPCalculator() {

            System.out.println("\nПеременные не указаны");
            ExOOPCalculator calc2 = new ExOOPCalculator();
            getResultWithTryCatch(calc2);

            System.out.println("\nОперация не указана");
            calc2.setVar1(12);
            calc2.setVar2(-1.789);
            getResultWithTryCatch(calc2);

            System.out.println("\nНедопустимая операция");
            calc2.setOperation("ololo");
            getResultWithTryCatch(calc2);

            System.out.println("\nДеление на ноль");
            calc2.setVar2(0);
            calc2.setOperation("/");
            getResultWithTryCatch(calc2);

            System.out.println("\nПозитивный кейс");
            calc2.setVar2(17);
            getResultWithTryCatch(calc2);

    }
}
