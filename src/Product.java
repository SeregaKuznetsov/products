import java.util.Arrays;

public class Product implements Comparable {



    protected int rating;
    protected double price;
    protected String name;

    public Product(String name, int rating, double price) {
        this.price = price;
        this.name = name;
        this.rating = rating;
    }

    public static void show() {
        Arrays.sort(Main.products);

        for (int i = 0; i < Main.products.length; i++) {
            System.out.println(Main.products[i].name + " Rating - " +
                    Main.products[i].rating + " Price - " + Main.products[i].price);
        }
    }

    public int compareTo(Object obj)
    {
        Product tmp = (Product) obj;
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
