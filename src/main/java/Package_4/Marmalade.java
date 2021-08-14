package Package_4;

public class Marmalade extends Sweets {

    private String form;
    private String colour;

    public Marmalade(String name, double weight, double price, String form, String colour) {
        super(name, weight, price);
        this.form = form;
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Мармелад" +
                ", форма: " + form +
                ", цвет: " + colour +
                super.toString();
    }
}
