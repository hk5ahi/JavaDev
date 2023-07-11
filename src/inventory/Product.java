package inventory;
import java.util.HashMap;
public class Product {

    public static HashMap<String,Integer> products=new HashMap<String,Integer>();

    public void addProducts(String productName)
    {
        products.put(productName,1);
        System.out.println("The product has been added in the inventory.");

    }

    public void updateQuantities (String name,int quantity)
    {
        products.put(name,quantity);
    }

    public static int getQuantities(String name)
    {
        Integer r=products.get(name);
        return r.intValue();
    }




}
