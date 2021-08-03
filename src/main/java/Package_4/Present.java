package Package_4;

import java.util.Scanner;

public class Present {
    public static void make() {
            Scanner scan =new Scanner(System.in);

            System.out.println("Введите вес пончиков");
            double weight = scan.nextDouble();
            Donut donuts = new Donut("Пончики", weight, 19.99, "шоколадная");

            System.out.println("Введите вес мармелада");
            weight = scan.nextDouble();
            Marmalade marmalade = new Marmalade("Мармелад", weight, 60, "мишки", "красный");

            System.out.println("Введите вес конфет");
            weight = scan.nextDouble();
            Candy candies = new Candy("Конфеты", weight, 19.99, 10);

            System.out.println("Список товаров: " + Sweets.getAllSweets());
            System.out.printf("\nЦена подарка: %.2f руб\n",Sweets.getTotalPrice());
            System.out.printf("\nВес подарка: %.3f кг\n",Sweets.getTotalWeight());


    }
}