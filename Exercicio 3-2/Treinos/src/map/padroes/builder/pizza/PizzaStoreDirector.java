package map.padroes.builder.pizza;

public class PizzaStoreDirector {

	protected PizzaBuilder tipopizza;
	
	public void montaPizza() {
		tipopizza.prepare().bake().cut().box();
	}
	
	public String result() {
		return tipopizza.toString();
	}

	public PizzaStoreDirector(PizzaBuilder tipopizza) {
		super();
		this.tipopizza = tipopizza;
	}
	
	
}
