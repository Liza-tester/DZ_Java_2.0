package Packedge_7;

public class ExDemonstration {
    public static void ExOOPCalculator() {

        System.out.println("\nПеременные не указаны");
        ExOOPCalculator calc2 = new ExOOPCalculator();
        System.out.printf("(%.4f) %s (%.4f)",calc2.getVar1(),calc2.getOperation(), calc2.getVar2());
        System.out.printf("= (%.4f)",calc2.getResult());

        System.out.println("\nОперация не указана");
        calc2.setVar1(12);
        calc2.setVar2(-1.789);
        System.out.printf("(%.4f) %s (%.4f)",calc2.getVar1(),calc2.getOperation(), calc2.getVar2());
        System.out.printf("= (%.4f)",calc2.getResult());

        System.out.println("\nНедопустимая операция");
        calc2.setOperation("ololo");
        System.out.printf("(%.4f) %s (%.4f)",calc2.getVar1(),calc2.getOperation(), calc2.getVar2());
        System.out.printf("= (%.4f)",calc2.getResult());

        System.out.println("\nДеление на ноль");
        calc2.setVar2(0);
        calc2.setOperation("/");
        System.out.printf("(%.4f) %s (%.4f)",calc2.getVar1(),calc2.getOperation(), calc2.getVar2());
        System.out.printf("= (%.4f)",calc2.getResult());

        System.out.println("\nПозитивный кейс");
        calc2.setVar2(17);
        System.out.printf("(%.4f) %s (%.4f)",calc2.getVar1(),calc2.getOperation(), calc2.getVar2());
        System.out.printf("= (%.4f)",calc2.getResult());


    }
}
