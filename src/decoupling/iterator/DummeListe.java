package decoupling.iterator;

import java.util.Iterator;

public class DummeListe implements Iterable<Integer> {
    private final int[] values;

    public DummeListe(int[] arr) {
        this.values = arr;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            int index = 0;

            @Override
            public boolean hasNext() {
                return values.length > index;
            }

            @Override
            public Integer next() {
                return values[index++];
            }
        };
    }

    public void doSomething() {
        System.out.println("Dumme Liste");
    }
}
