public class Cake extends Product{
    private String taste;
    public Cake(String name, double price, double value, String taste) {
        super(name, price, value);
        this.taste = taste;
    }

    @Override
    public String toString() {
        return String.format("Торт  %s, %s", taste, super.toString());
    }
}
