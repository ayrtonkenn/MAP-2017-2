package map.padroes.builder.pizza;

public class MainAppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PizzaStoreDirector store = new PizzaStoreDirector(new PizzaChicagoClamBuilder());
		
		store.montaPizza();
		System.out.println(store.toString());
	}

}
