import Package_1_2.Calculator;
import Package_1_2.MaxLengthWord;

import java.util.Scanner;

public class Starter {
    public static void main(String[] args) {
        System.out.println("Введите номер неоходимого действия");
        System.out.println("1 - запуск Калькулятора ");
        System.out.println("2 - поиск максимального слова");

        Scanner scan = new Scanner(System.in);
        int action = scan.nextInt();
        switch (action){
            case 1:
                Calculator.count();
                break;
            case 2:
                MaxLengthWord.printWord();
                break;
            default:
                break;
        }
    }
}
