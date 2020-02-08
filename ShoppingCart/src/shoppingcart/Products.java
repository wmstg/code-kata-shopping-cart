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
     * Gets the price of the product
     * 
     * @param key The product
     * @return The price of the product
     */
    public int getPrice(char key){
        return items.get(Character.toString(key));
    }
}
