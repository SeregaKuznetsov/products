import java.util.Arrays;

public class Bicycle extends Trainer{
    public int maxSpeed;
    public Bicycle(String name, int rating, double price, int maxWeight, int maxSpeed) {
        super(name, rating, price, maxWeight);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getMaxWeight() {
        return maxWeight;
    }

    public static void show() {
        Arrays.sort(Main.products);

        for (int i = 0; i < Main.products.length; i++) {
            if (Main.products[i] instanceof Trainer) {
                System.out.println(Main.products[i].name + " Rating - " +
                        Main.products[i].rating + " Price - " + Main.products[i].price +
                 + getMaxWeight());
            }
        }
    }

    @Override
    public int compareTo(Object obj)
    {
        Bicycle tmp = (Bicycle) obj;
        if(this.rating < tmp.rating)
        {
            return -1;
        }
        else if(this.rating > tmp.rating)
        {
            return 1;
        }
        return 0;
    }
}
