/* Object BakeryItem.
* Includes one attribute and related behavior of items in a Bakery.
* @author Sebastian Byczkowski
*/

//Abstract class
public abstract class BakeryItem{
	/** The name of the BakeryItem.*/
	private String name;
	
	//Getters and Setters
	/* Assigns a new name to the BakeryItem name.
	* @param name to assign to a BakeryItem.*/
	public void setName(String name){
		this.name = name;
	}
	
	/* Returns current name of the BakeryItem.
	* @return current name.*/
	public String getName(){
		return name;
	}
	
	//Constructor
	/* Constructs a new <code>BakeryItem</code> object with a parameter of name.
	@param name starting value for new BakeryItem.*/
	public BakeryItem(String name){
		this.name = name;
	}
	
	/*Abstract method with no parameters.
	*@see calcualtePrice().  Do something with it.*/
	public abstract double calculatePrice();
	
	/*Creates and returns a string representation of BakeryItem object.  This string will
	will display the name of the BakeryItem and an abstract method of calculatePrice().
	@return string representation of <code>BakeryItem</code.*/
	public String toString(){
		return name + "  $" + calculatePrice();
	}
}