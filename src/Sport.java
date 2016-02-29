import java.util.Arrays;

public class Sport extends Product {

    public Sport(String name, int rating, double price) {
        super(name,rating,price);
    }


    public static void show() {
        Arrays.sort(Main.products);

        for (int i = 0; i < Main.products.length; i++) {
            if (((Main.products[i] instanceof Bicycle) | (Main.products[i] instanceof Trainer))) {
                System.out.println(Main.products[i].name + " Rating - " +
                        Main.products[i].rating + " Price - " + Main.products[i].price);
            }
        }
    }

    @Override
    public int compareTo(Object obj)
    {
        Sport tmp = (Sport) obj;
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
