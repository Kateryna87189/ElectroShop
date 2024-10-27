import java.util.Comparator;

public class RatingDescendingComparator implements Comparator<Produkt> {
    @Override
    public int compare(Produkt o1, Produkt o2) {
        return Double.compare(o2.getRating(), o1.getRating());
    }
}
