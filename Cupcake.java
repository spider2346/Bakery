/* Object Cupcake
* Inherits one object from BakeryItem and creates related behaviors towards it.
* @author Sebastian Byczkowski
*/

/* Cupcakeclass inherits BakeryItem Object and creates
	a size instance.
	@inheritDoc*/
public class Cupcake extends BakeryItem{
	private char size;
	/* Overload Constructor. Copies Constructor <code>BakeryItem</code> with parameters
		name.  Creates new instances size.
		@param name, size for Cupcake object.*/
	public Cupcake(String n, char size){
		super(n);
		this.size = size;
	}
	
	//Overrides abstract method in BakeryItem.
	/* Determines amount for BakeryItem based on selection.
	@return amount for each particlar size.  Medium, Regular, Large.*/
	public double calculatePrice(){
		
		if(size == 'M'){
			return (20.0);
		}
		
		if(size == 'R'){
			return (30.0);
		}
		
		if(size == 'L'){
			return(39.0);
		}
		
		return size;
	}
	
}