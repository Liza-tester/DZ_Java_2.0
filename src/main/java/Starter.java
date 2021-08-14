import Package_1_2.Calculator;
import Package_1_2.MaxLengthWord;
import Package_1_2.MinMaxArrayReplacer;
import Package_4.Present;

import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        System.out.println("Введите номер неоходимого действия");
        System.out.println("1 - запуск Калькулятора ");
        System.out.println("2 - поиск максимального слова");
        System.out.println("3 - поиск элементов массива с заменой");
        System.out.println("4 - создать сладкий подарок");

        Scanner scan = new Scanner(System.in);
        int action = scan.nextInt();
        switch (action){
            case 1 : {Calculator.count(); break;}
            case 2 : {MaxLengthWord.printWord(); break;}
            case 3 : {MinMaxArrayReplacer.getResult(); break;}
            case 4 : {Present.make(); break;}
            default: break;
        }
        scan.close();
    }
}
