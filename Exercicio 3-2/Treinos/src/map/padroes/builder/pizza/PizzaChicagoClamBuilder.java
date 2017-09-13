package map.padroes.builder.pizza;

import java.util.ArrayList;

public class PizzaChicagoClamBuilder implements PizzaBuilder {

	private String name = "Chicago Style Clam Pizza";
	private String dough = "Extra Thick Crust Dough";;
	private String sauce = "Plum Tomato Sauce";
	private ArrayList<String> toppings =  new ArrayList<String>();
	
	
	public PizzaChicagoClamBuilder() {
		// TODO Auto-generated constructor stub
		toppings.add("Shredded Mozzarella Cheese");
  		toppings.add("Black Olives");
  		toppings.add("Spinach");
  		toppings.add("Eggplant");
  		toppings.add("Sliced Pepperoni");
	}
	public PizzaBuilder prepare() {
		System.out.println("Prepare " + name);
  		System.out.println("Tossing dough...");
  		System.out.println("Adding sauce...");
  		System.out.println("Adding toppings: ");
  		for (String topping : toppings) {
  			System.out.println("   " + topping);
  		}
		return this;
	}

	@Override
	public PizzaBuilder bake() {
		System.out.println("Bake for 25 minutes at 350");
		return this;
	}

	@Override
	public PizzaBuilder box() {
		System.out.println("Place pizza in official PizzaStore box");
		return this;
	}

	@Override
	public PizzaBuilder cut() {
		System.out.println("Cutting the pizza into square slices");
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
}
