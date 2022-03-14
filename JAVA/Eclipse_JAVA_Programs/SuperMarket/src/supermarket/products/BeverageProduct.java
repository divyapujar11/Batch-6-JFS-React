package supermarket.products;

public class BeverageProduct extends GroceryProduct implements Drinkable{
	private SugarLevel SugarLevel;
	public BeverageProduct(String name, double price, double discount, SugarLevel SugarLevel) {
		super(name, price, discount);
		// TODO Auto-generated constructor stub
		this.SugarLevel = SugarLevel;
	}
	public SugarLevel getSugarLevel() {
		return SugarLevel;
	}
	public void setSugarLevel(SugarLevel sugarLevel) {
		SugarLevel = sugarLevel;
	}
	@Override
	public String toString() {
		return super.toString() + "SugarLevel =" + SugarLevel;
	}
	@Override
	public boolean isHealthy() {
		// TODO Auto-generated method stub
		return SugarLevel != SugarLevel.ADDED_SUGAR;
	}

	
}
