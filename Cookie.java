/* Object Cookie
* Inherits one object from BakeryItem and creates related behaviors towards it.
* @author Sebastian Byczkowski
*/

/* Cookie class inherits BakeryItem Object and creates
	a quanity and pricePerOz.
	@inheritDoc*/
public class Cookie extends BakeryItem{
	private int quantity;
	private double pricePerDoz;
	
	/* Overload Constructor. Copies Constructor <code>BakeryItem</code> with parameters
		name.  Creates new instances of quantity and pricePerDoz.
		@param name, quanity, pricePerOz for Cookie object.*/
	public Cookie(String n, int quantity, double pricePerDoz){
		super(n);
		this.quantity = quantity;
		this.pricePerDoz = pricePerDoz;
	}
	
	//Overrides abstract method in BakeryItem.
	/* Calculates price for quanity and pricePerDoz.
	@return calculated price for overall price.*/
	public double calculatePrice(){
		
		double calcPrice;
		int quanity = 0;
		double pricePerDoz = 5.32;
		
		calcPrice = pricePerDoz / quantity;
		
		return calcPrice;
}

}