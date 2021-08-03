package Package_4;


public abstract class Sweets {
    private String name;
    private double weight ;
    private double price ;

    private static String allSweets = "";
    private static double totalPrice ;
    private static double totalWeight ;

    public Sweets(String name, double weight, double price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }


    public static double getTotalPrice() {
        return totalPrice;
    }

    public static void setTotalPrice(double totalPrice) {
        Sweets.totalPrice = totalPrice;
    }

    public static double getTotalWeight() {
        return totalWeight;
    }

    public static void setTotalWeight(double totalWeight) {
        Sweets.totalWeight = totalWeight;
    }

    public static String getAllSweets() {
        return allSweets;
    }

    public static void setAllSweets(String allSweets) {
        Sweets.allSweets = allSweets;
    }
}
