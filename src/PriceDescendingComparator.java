import java.util.Comparator;

public class PriceDescendingComparator implements Comparator<Produkt> {
    @Override
    public int compare(Produkt o1, Produkt o2) {
        return Double.compare(o2.getPrice(),o1.getPrice());
    }
}
