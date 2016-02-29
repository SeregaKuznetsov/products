import java.util.Arrays;

public class Main {

    public static Product [] products = new Product[6];

    public static void main(String[] args) {

        products[0] = new Bicycle("Bike1", 69, 1000, 110, 5);
        products[1] = new Bicycle("Bike2", 39, 112000, 80, 12);
        products[2] = new Bicycle("Bike3", 23, 12000, 100, 8);

        products[3] = new Treadmill("Treadmill1", 72, 10000, 120);
        products[4] = new Treadmill("Treadmill2", 45, 1120, 80);
        products[5] = new Treadmill("Treadmill3", 66, 18800, 100);


        Trainer.show();

    }
}