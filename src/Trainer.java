public class Trainer extends Sport {
    public int maxWeight;
    public Trainer (String name, int rating, double price, int maxWeight) {
        super(name, rating, price);
        this.maxWeight = maxWeight;
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
