import java.util.Comparator;

public class PriceAscendingComparator implements Comparator<Produkt> {
    @Override
    public int compare(Produkt o1, Produkt o2) {
        return Double.compare(o1.getPrice(), o2.getPrice());
    }
}
