/* Driver BakeryDriver.
* Main method for Bakery Item object and its children.
* @author Sebastian Byczkowski
*/

//Imports ArrayList
import java.util.ArrayList;

//Main method.  Driver class for BakeryItem.
public class BakeryDriver{
    public static void main(String[] args){
		//Creates an Arraylist with object(s) in BakeryItem.
        ArrayList<BakeryItem> items = new ArrayList<>();
		/*@param Creates Cupcake and assigns specific value.
		  @param Creates Cookie and assigns specific values.
		  @param Creates Cupkae and assigns it specific values.
		  */
        items.add(new Cupcake("Red Velvet Cupcakes:", 'R'));
        items.add(new Cookie("Chocolate Chip Cookies:", 4, 3.99));
        items.add(new Cupcake("Pink Lemonade Cupcakes:", 'M'));
                
		//Print statement.		
        System.out.println("The items purchased were:");
		
		//Creates a total amount.
        double total = 0;
		
		/*For loop to display all objects and its respected relations
		and prints out a string represenation of an object.*/
        for(BakeryItem itm : items){
            total += itm.calculatePrice();
            System.out.println(itm);
        }
		//Print statement.
        System.out.println("Total purchase amount (before tax): $" + total);
        
    }
}