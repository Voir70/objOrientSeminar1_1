public class Main {
    public static void main(String[] args) {
        VendingMachine mart = new VendingMachine();
        mart.addProduct(new Product("Хлеб", 35, 10))
                .addProduct(new Milk("Белоснежка", 50, 2))
                .addProduct(new Product("Сыр", 100.2, 5))
                .addProduct(new ConcentrateMilk("Советская", 150, 1))
                .addProduct(new Chocolate("Аленка", 35.20, 3, "Ореховый"))              //.addProduct(new Arabica("Lavatsa", 800, 1));
                .addProduct(new Cake("Фантазия", 200.50, 2, "Шоколадный"));

        System.out.println("До продажи");
        System.out.println(mart);
        PrintSell(mart, "Белоснежка");
        PrintSell(mart, "Белоснежка");
        PrintSell(mart, "Белоснежка");
        System.out.println();
        System.out.println("После продажи");
        System.out.println(mart);
        System.out.println();
        PrintSell(mart, "Фиговина");
        System.out.println(mart);
        System.out.println(mart);
        System.out.println();
    }
    private static void PrintSell(VendingMachine machine, String nameProd) {
        try {
            System.out.println(machine.sell(nameProd));
        } catch (Exception e) {
        }
        System.out.println("Товар не найден");
    }
}


