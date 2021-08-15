import Package_1_2.Calculator;
import Package_1_2.MaxLengthWord;
import Package_1_2.MinMaxArrayReplacer;
import Package_4.Present;
import Package_5.Demonstration;
import Packedge_6.DemoWordsInFile;


import java.io.FileNotFoundException;
import java.util.*;

public class Starter {
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Введите номер неоходимого действия");
        System.out.println("1 - запуск Калькулятора ");
        System.out.println("2 - поиск максимального слова");
        System.out.println("3 - поиск элементов массива с заменой");
        System.out.println("4 - создать сладкий подарок");
        System.out.println("5 - запуск ООП Калькулятора");
        System.out.println("6 - запуск обработки файла со словами");

        Scanner scan = new Scanner(System.in);
        int action = scan.nextInt();
        switch (action){
            case 1 : {Calculator.count(); break;}
            case 2 : {MaxLengthWord.printWord(); break;}
            case 3 : {MinMaxArrayReplacer.getResult(); break;}
            case 4 : {Present.make(); break;}
            case 5 : {Demonstration.OOPCalculator();break;}
            case 6 : { DemoWordsInFile.run();break;}
            default: break;
        }
        scan.close();

    }

}
