package adapter;

public interface IStack<E> {
    E pop();
    E peek();
    void push(E element);
    void reverse();
}
