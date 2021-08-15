package Package_5;

public class Demonstration {
    public static void OOPCalculator() {

        System.out.println("Заполнение переменных в конструкторе");
        OOPCalculator calc1 = new OOPCalculator(4.78, -34, "*");
        System.out.printf("(%.2f) %s (%.2f)",calc1.getVar1(),calc1.getOperation(), calc1.getVar2());
        System.out.println(calc1.getResult());
        System.out.println(calc1.getErrorStatus());

        System.out.println("\nПустой конструктор");
        OOPCalculator calc2 = new OOPCalculator();
        System.out.printf("(%.4f) %s (%.4f)",calc2.getVar1(),calc2.getOperation(), calc2.getVar2());
        System.out.println(calc2.getResult());

        System.out.println("\nДобавление данных вручную");
        calc2.setVar1(12);
        calc2.setVar2(-1.789);
        System.out.printf("(%.2f) %s (%.2f)",calc2.getVar1(),calc2.getOperation(), calc2.getVar2());
        System.out.println(calc2.getResult());
        calc2.setOperation("/");
        System.out.printf("(%.2f) %s (%.2f)",calc2.getVar1(),calc2.getOperation(), calc2.getVar2());
        System.out.println(calc2.getResult());

        System.out.println("\nОшибки");
        calc2.setVar2(0);
        System.out.printf("(%.2f) %s (%.2f)",calc2.getVar1(),calc2.getOperation(), calc2.getVar2());
        System.out.println(calc2.getResult());
        calc2.setVar2(-1.352);
        calc2.setOperation("ololo");
        System.out.printf("(%.2f) %s (%.2f)",calc2.getVar1(),calc2.getOperation(), calc2.getVar2());
        System.out.println(calc2.getResult());
    }
}
