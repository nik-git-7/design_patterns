package iterator;

public class Main {
    public static void main(String[] args) {
        DummeListe liste = new DummeListe(new int[]{1, 2, 3, 8, 5, 6});
        for (int i : liste) {
            System.out.println(i);
        }

        liste.doSomething();

        DummeListe list = new DummeListe(new int[]{1, 2, 3, 8, 5, 6}) {
            @Override
            public void doSomething() {
                System.out.println("Anonyme Klasse");
            }
        };

        list.doSomething();
    }
}
