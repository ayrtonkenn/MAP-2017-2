package map.padroes.builder.pizza;

import java.util.ArrayList;

public class PizzaChicagoCheeseBuilder implements PizzaBuilder {

	private String name;
	private String dough;
	private String sauce;
	private ArrayList<String> toppings =  new ArrayList<String>();
	@Override
	public PizzaBuilder prepare() {
		System.out.println("Prepare " + name);
  		System.out.println("Tossing dough...");
  		System.out.println("Adding sauce...");
  		System.out.println("Adding toppings: ");
  		for (String topping : toppings) {
  			System.out.println("   " + topping);
  		}
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public PizzaBuilder bake() {
		// TODO Auto-generated method stub
		System.out.println("Bake for 25 minutes at 350");
		return this;
	}

	@Override
	public PizzaBuilder box() {
		System.out.println("Cutting the pizza into square slices");
		// TODO Auto-generated method stub
		return this;
	}

	@Override
	public PizzaBuilder cut() {
		// TODO Auto-generated method stub
		return this;
	}
	public String toString() {
  		StringBuffer display = new StringBuffer();
  		display.append("---- " + name + " ----\n");
  		display.append(dough + "\n");
  		display.append(sauce + "\n");
  		for (String topping : toppings ) {
  			display.append(topping + "\n");
  		}
  		return display.toString();
	}
	
	public class Teste {
		
	}
}
