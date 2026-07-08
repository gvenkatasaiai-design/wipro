public class Fruit {
    String name, taste, size;

    Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    void eat() {
        System.out.println(name + " tastes " + taste);
    }

    public static void main(String[] args) {
        Fruit f = new Fruit("Fruit", "Sweet", "Medium");
        f.eat();

        Apple a = new Apple("Apple", "Sweet", "Medium");
        a.eat();

        Orange o = new Orange("Orange", "Sour", "Medium");
        o.eat();
    }
}

class Apple extends Fruit {

    Apple(String name, String taste, String size) {
        super(name, taste, size);
    }

    @Override
    void eat() {
        System.out.println(name + " tastes " + taste);
    }
}

class Orange extends Fruit {

    Orange(String name, String taste, String size) {
        super(name, taste, size);
    }

    @Override
    void eat() {
        System.out.println(name + " tastes " + taste);
    }
}