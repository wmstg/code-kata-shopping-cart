package shoppingcart;

import java.util.Scanner;

/**
 *
 * @author G Williams
 */
public class ShoppingCart {
    static final Products products = new Products();
    static Boolean quit = false;
    int total = 0;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ShoppingCart sCart = new ShoppingCart();
        
        // 1. Uncomment below to loop the shopping cart. See 2.
        //while (!quit){
            
            // Displays the welcome message
            sCart.displayWelcome();

            // Displays the products available
            products.displayProducts();

            // Obtain the user input
            Scanner userInput = new Scanner(System.in);
            String order = userInput.nextLine();

            // Add to cart
            sCart.calculateTotal(order);

            // Display the total
            sCart.displayTotal();

            // 2. Uncomment below to loop the shopping cart. See 1.
            /*System.out.println("Do you want to start again? Type Q to quit any other key to continue");
            if (((String) userInput.nextLine()).equals("Q")){
                quit = true;
            }
            sCart.total = 0;
        }*/
        
    }
    
    /*
    Displays a welcome message
    */
    protected void displayWelcome(){
        String message =
                "*******************************************\n"
                + "Welcome to the Supermarket Shopping Cart\n"
                + "*******************************************\n\n";
        System.out.print(message);
    }
    
    /**
     * Calculates the total of the items
     * 
     * @param String A string representing the products ordered
     */
    protected void calculateTotal(String items){
        // Initialize variables
        int offersA = 0;
        int offersB = 0;
        
        // Loop through each character
        for (int i=0; i<items.length(); i++){
            char item = items.charAt(i);
            
            /*
            Since we know that offers do not apply to
            products C or D. We won't do anything special
            with them.
            */
            if ((item == 'C' || item == 'D'))
            {
                total += products.getPrice(item);
            }

            // Apply the offers for Product A and B.
            if (item == 'A'){
                offersA++;
                if ((offersA%3)==0){
                    total += 130;
                    offersA = 0;
                }
            }
            if (item == 'B'){
                offersB++;
                if ((offersB%2)==0){
                    total += 37;
                    offersB = 0;
                }
            }
        }
        // Do some working with the remaining items for products A and B
        total+= (products.getPrice('A')*offersA);
        total+= (products.getPrice('B')*offersB);
    }
    
    /**
     * Displays the total order price
     */
    private void displayTotal(){
        System.out.print("The total order price is: " + total);
        System.out.print("\n\n");
    }
}
