package supermarket.products;

public class Cart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeverageProduct Sprite = new BeverageProduct("Spirte", 2.5, 10, SugarLevel.LIGHT);
		BeverageProduct Cola = new BeverageProduct("Cola", 4, 0, SugarLevel.ADDED_SUGAR);
		
		DairyProduct Yogu = new DairyProduct("Yogu", 5.5, 15, Fat.SKIMMED);
		DairyProduct Juhayna = new DairyProduct("Juhayna", 4, 25, Fat.FULLCREAM);
		
		System.out.println(Sprite.isHealthy());
		System.out.println(Cola.isHealthy());
		
		System.out.println(Sprite.getActualPrice());
		System.out.println(Cola.getActualPrice());
		System.out.println(Yogu.getActualPrice());
		System.out.println(Juhayna.getActualPrice());
		
		System.out.println(Sprite);
		System.out.println(Cola);
		System.out.println(Yogu);
		System.out.println(Juhayna);
	}

}
