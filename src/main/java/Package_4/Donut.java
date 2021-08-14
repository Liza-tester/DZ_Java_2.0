package Package_4;

public class Donut extends Sweets{

    private String filling;

    public  Donut(String name, double weight, double price, String filling) {
        super(name, weight, price);
        this.filling = filling;
    }

    @Override
    public String toString() {
        return "Пончики" +
                ", начинка: " + filling +
                super.toString();
    }
}
