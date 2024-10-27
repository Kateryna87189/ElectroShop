/*
 У каждого товара есть наименование,
цена, рейтинг, количество штук на складе и т.д.
 */
public class Produkt {
    private String name;
    private int price;
    private double rating;
    private  int quantity;

    public Produkt(String name, int price, double rating, int quantity ) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return String.format("Name of produkt: %s. (%d), rating %.2f, quantity of the storage %d ",
                name, price,  rating, quantity)+System.lineSeparator();
    }
}
