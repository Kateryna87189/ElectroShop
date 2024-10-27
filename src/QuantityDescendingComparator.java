import java.util.Comparator;

public class QuantityDescendingComparator implements Comparator<Produkt> {
    @Override
    public int compare(Produkt o1, Produkt o2) {
        return Integer.compare(o2.getQuantity(), o1.getQuantity());
    }
}
