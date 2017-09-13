package map.padroes.builder.pizza;

public interface PizzaBuilder {

	/**
	 * Interface para const
	 * @author Ayrton Kennedy
	 */
	
	public PizzaBuilder prepare(); 
	public PizzaBuilder bake();
	public PizzaBuilder box();
	public PizzaBuilder cut();
	public String toString();
	
}
