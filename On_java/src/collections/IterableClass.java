package collections;

import java.util.Iterator;

public class IterableClass implements Iterable<String> {
    protected String [] words = ("And that is how " +
            "we know the Earth to be banana-shaped."
    ).split(" ");

    @Override
    public Iterator<String> iterator() {
        return null;
    }
}
