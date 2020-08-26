public class EProduct {

    private String serialNumber;
    private double price;

    private EProductSpec eProductSpec;

    public EProduct(String serialNumber, double price,EProductSpec eProductSpec) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.eProductSpec = eProductSpec;
    }

    public String getSerialNumber() {
        return serialNumber;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public EProductSpec getSpec(){
        return eProductSpec;
    }

    @Override
    public String toString() {
        return "EProduct{" +
                "serialNumber='" + serialNumber + '\'' +
                ", price=" + price +
                ", eProductSpec=" + eProductSpec +
                '}';
    }
}
