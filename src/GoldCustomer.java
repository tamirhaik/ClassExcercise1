public class GoldCustomer extends Customer{
    //constructor
    public GoldCustomer(int id, String name) {
        super(id, name);
    }

    @Override
    public double getPriceForProduct(double fullPrice) {
        return fullPrice*0.8;
    }
}
