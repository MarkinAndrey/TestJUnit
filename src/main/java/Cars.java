public class Cars {
    String name;
    int price;
    int old;

    public Cars(String name, int price, int old) {
        this.name = name;
        this.price = price;
        this.old = old;
    }

    public String getName() {
        return name;
    }

    public Cars setName(String name) {
        this.name = name;
        return this;
    }

    public int getOld() {
        return old;
    }

    public int newYear() {
        return (old++);
    }
}
