public class Bicycle extends Trainer{
    public int maxSpeed;
    public Bicycle(String name, int rating, double price, int maxWeight, int maxSpeed) {
        super(name, rating, price, maxWeight);
        this.maxSpeed = maxSpeed;
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
