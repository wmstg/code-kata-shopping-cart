package shoppingcart;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author G Williams
 */
public class Products {
    protected HashMap<String, Integer> items = new HashMap<String, Integer>();
    
    
    public Products(){
        items.put("A", 50);
        items.put("B", 30);
        items.put("C", 20);
        items.put("D", 10);
    }
    
    /**
     * Displays the products available along with its price, offers and a brief
     * description on how to make an order .
     */
    public void displayProducts(){
        String message = "Please have a look at our products and offers.\n\n";
        
        Iterator iterator = items.entrySet().iterator();
        
        // Loop through the products
        while (iterator.hasNext()){
            Map.Entry product = (Map.Entry) iterator.next();
            message += "Product: " + product.getKey() + " \tPrice: " + product.getValue() +
                    " \tOffer: " + offers(product.getKey().toString()) + "\n";
        }
        
        message += "\n";
        message += "Please enter your choice of items with no spaces. Example; BDDC \n";
        
        System.out.println(message);
    }
    
    /**
     * Displays any available offers for products
     * 
     * @param product The string representation of the product
     * @return The offer description
     */
    private String offers(String product){
        switch (product){
            case "A":
                return "3 for 130";
            case "B":
                return "2 for 37";
            default:
                return "N/A";
        }
    }
        
    /**
     * Gets the price of the product
     * 
     * @param key The product
     * @return The price of the product
     */
    public int getPrice(char key){
        return items.get(Character.toString(key));
    }
}
