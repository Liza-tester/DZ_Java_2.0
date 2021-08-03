package Package_4;

public class Donut extends Sweets{

    private String filling;

    public Donut(String name, double weight, double price, String filling) {
        super(name, weight, price);
        this.filling = filling;
        setTotalWeight(getTotalWeight()+weight);
        setTotalPrice(getTotalPrice()+weight*price);
        setAllSweets(getAllSweets()+"\n"+
                name + " - начинка: " + filling +
                ", цена за кг: " + price +
                ", вес: " + weight);
    }


}
