package Package_4;

public class Candy extends Sweets {

    private int number;

    public Candy(String name, double weight, double price, int number) {
        super(name, weight, price);
        this.number = number;
    }

    @Override
    public String toString() {
        return "Конфеты " +
                ", шт в пачке: " + number +
                super.toString();
    }
}

