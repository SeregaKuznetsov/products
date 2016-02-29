import java.util.Arrays;

public class Trainer extends Sport {
    public int maxWeight;
    public Trainer (String name, int rating, double price, int maxWeight) {
        super(name, rating, price);
        this.maxWeight = maxWeight;
    }

    public static void show() {
        Arrays.sort(Main.products);

        for (int i = 0; i < Main.products.length; i++) {
            if (Main.products[i] instanceof Trainer) {
                System.out.println(Main.products[i].name + " Rating - " +
                        Main.products[i].rating + " Price - " + Main.products[i].price);
            }
        }
    }

    @Override
    public int compareTo(Object obj)
    {
        Trainer tmp = (Trainer) obj;
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
