import java.util.Arrays;

public class Sport extends Product {

    public Sport(String name, int rating, double price) {
        super(name,rating,price);
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
