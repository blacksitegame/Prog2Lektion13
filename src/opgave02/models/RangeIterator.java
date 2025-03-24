package opgave02.models;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class RangeIterator implements Iterator<Integer> {
    private int start;
    private int end;
    private int current;

    public RangeIterator(int start, int end) {
        this.start = start;
        this.end = end;
        this.current = start;
    }

    @Override
    public boolean hasNext() {
        return current <= end;
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return current++;
    }
}
