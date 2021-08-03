package Package_4;

public class Candy extends Sweets {

    private int number;

    public Candy(String name, double weight, double price, int number) {
        super(name, weight, price);
        this.number = number;

        setTotalWeight(getTotalWeight() + weight);
        setTotalPrice(getTotalPrice() + weight * price);
        setAllSweets(getAllSweets() + "\n" + name +
                " - количество в пачке: " + number +
                ", цена за кг: " + price +
                ", вес: " + weight);
    }
}

