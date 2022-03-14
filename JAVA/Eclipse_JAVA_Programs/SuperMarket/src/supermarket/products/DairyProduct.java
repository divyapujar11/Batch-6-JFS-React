package supermarket.products;

public class DairyProduct extends GroceryProduct{
	private Fat Fat;
	public DairyProduct(String name, double price, double discount, Fat Fat) {
		super(name, price, discount);
		// TODO Auto-generated constructor stub
		this.Fat = Fat;
	}
	public Fat getFat() {
		return Fat;
	}
	public void setFat(Fat fat) {
		Fat = fat;
	}
	@Override
	public String toString() {
		return super.toString()+"Fat level =" + Fat;
	}




}
