package assignment2;

class Product {
    public String bcode, title;
    public int quantity;
    public double price;

    // Default constructor
    Product() {
    }

    /**
     *
     * Constructor method to initialize a product
     *
     * @param bcode    Product's bar code
     *
     * @param title    Product's title
     *
     * @param quantity Product's quantity
     *
     * @param price    Product's price
     *
     */

    Product(String bcode, String title, Integer quantity, double price) {
	this.bcode = bcode;
	this.title = title;
	this.quantity = quantity;
	this.price = price;
    }

    /**
     *
     * Convert this product to String for printing
     *
     */

    @Override
    public String toString() {
	return this.bcode + "  |  " + this.title + "  |  " + this.quantity + "  |  " + this.price;
    }

}
