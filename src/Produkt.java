/*
 У каждого товара есть наименование,
цена, рейтинг, количество штук на складе и т.д.
 */
public class Produkt {
    private String name;
    private double price;
    private double rating;
    private  int quantity;

    public Produkt(String name, double price, double rating, int quantity ) {
        this.name = name;
        this.price = price;
        this.rating = rating;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
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
        return String.format("Назва продукту: %s. [%.2f Euro], рейтинг: [%.2f], кількість на складі: [%d] ",
                name, price,  rating, quantity)+System.lineSeparator();
    }
}
