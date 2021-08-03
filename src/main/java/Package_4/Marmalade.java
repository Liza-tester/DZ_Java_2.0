package Package_4;

public class Marmalade extends Sweets {

    private String form;
    private String colour;

    public Marmalade(String name, double weight, double price, String form, String colour) {
        super(name, weight, price);
        this.form = form;
        this.colour = colour;
        setTotalWeight(getTotalWeight()+weight);
        setTotalPrice(getTotalPrice()+weight*price);
        setAllSweets(getAllSweets()+"\n"+
                name + " - форма: " + form +
                ", цвет: " + colour +
                ", цена за кг: " + price +
                ", вес: " + weight);
    }
}
