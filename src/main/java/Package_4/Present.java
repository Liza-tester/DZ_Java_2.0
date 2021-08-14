package Package_4;


public class Present {
    public static void make() {

            Donut donuts1 = new Donut("Дырка от бублика", 300, 19.99, "шоколадная");
            Donut donuts2 = new Donut("Агония", 350, 26.99, "ванильная");
            Marmalade marmalade = new Marmalade("мармелад-1", 150, 60, "мишки", "красный");
            Candy candies = new Candy("Фантазия", 276, 37, 10);

            Sweets[] present = {donuts1, donuts2, marmalade, candies};

            double totalWeight = 0;
            double totalPrice = 0;

            for (Sweets tmp: present) {
                    System.out.println(tmp.toString());
                    totalWeight+=tmp.getWeight();
                    totalPrice+= tmp.getPrice();
            }
            System.out.printf("Вес подарка: %.2f кг\n", totalWeight/1000);
            System.out.printf("Цена подарка: %.2f руб", totalPrice);


    }
}