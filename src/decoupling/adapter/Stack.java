package decoupling.adapter;

import java.util.ArrayList;

public class Stack<E> implements IStack<E> {
    private ArrayList<E> elements = new ArrayList<>();

    @Override
    public E pop() {
        int index = elements.size() - 1;
        if (index < 0) {
            return null;
        }
        E element = elements.get(index);
        elements.remove(index);
        return element;
    }

    @Override
    public E peek() {
        int index = elements.size() - 1;
        if (index < 0) {
            return null;
        }
        return elements.get(index);
    }

    @Override
    public void push(E element) {
        elements.add(element);
    }

    @Override
    public void reverse() {
        ArrayList<E> reversedElements = new ArrayList<>();
        for (int i = elements.size() - 1; i >= 0; i--) {
            reversedElements.add(elements.get(i));
        }
        elements = reversedElements;
    }
}
