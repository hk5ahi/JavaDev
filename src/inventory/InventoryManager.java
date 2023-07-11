//Problem: Create a package called "com.example.inventory" and place classes like "Product" and "InventoryManager" inside it. Implement methods to add products, update quantities, and retrieve information about products in the inventory.

package inventory;

public class InventoryManager {


    public void getQuantities(String name)
    {
        int q=Product.getQuantities(name);
        System.out.printf("The mentioned %s has %d items in the inventory.",name,q);

    }
}
