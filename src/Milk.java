public class Milk extends Product{
    private double temperature;

    public Milk(String name, double price, double value) {
        super(name, price, value);
    }

    @Override
    public String toString() {
        return String.format("Молоко : %s" ,super.toString());
    }
}