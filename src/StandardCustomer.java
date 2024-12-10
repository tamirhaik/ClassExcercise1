public class StandardCustomer extends Customer{

    public StandardCustomer(int id, String name) {
        super(id, name);
    }

    //constructor
    @Override
    public double getPriceForProduct(double fullPrice) {
        return fullPrice;
    }
}
