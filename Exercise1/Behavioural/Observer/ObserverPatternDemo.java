package Observer;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Stock stock = new Stock("Tesla", 1000);

        Investor i1 = new Investor("Alice");
        Investor i2 = new Investor("Bob");

        stock.addObserver(i1);
        stock.addObserver(i2);

        stock.setPrice(1050);
        stock.setPrice(980);
    }
}
