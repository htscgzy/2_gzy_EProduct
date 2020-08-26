import java.util.Iterator;
import java.util.LinkedList;


public class Inventory {

    private LinkedList<EProduct> inventory = new LinkedList<>();

    public LinkedList<EProduct> getInventory() {
        return inventory;
    }


    public void addEProduct(String serialnumber, double price, EProductSpec eProductSpec){
        EProduct eProduct = new EProduct(serialnumber,price,eProductSpec);
        inventory.add(eProduct);
    }

    public EProduct get(String serialNumber){
        for(Iterator i=inventory.iterator();i.hasNext();){
            EProduct eProduct = (EProduct)i.next();
            if(eProduct.getSerialNumber().equals(serialNumber))
                return eProduct;
        }
        return null;

    }

    //SRP原则
    public LinkedList<EProduct> search(EProductSpec eProductSpec){
        LinkedList<EProduct> matchingEProduct = new LinkedList<>();
        for(Iterator i = inventory.iterator();i.hasNext();){
            EProduct eProduct = (EProduct)i.next();
            if(eProduct.getSpec().match(eProductSpec))
                matchingEProduct.add(eProduct);
        }
        return matchingEProduct;

    }
}
