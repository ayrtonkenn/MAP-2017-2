package software_design.factoryMethod;


class PizzaStoreFM {
  public abstract class PizzaStore {

  	abstract Pizza createPizza(String item);

  	public Pizza orderPizza(String type) {
  		Pizza pizza = createPizza(type);
  		System.out.println("--- Making a " + pizza.getName() + " ---");
  		pizza.prepare();
  		pizza.bake();
  		pizza.cut();
  		pizza.box();
  		return pizza;
  	}
  }
  public class ChicagoPizzaStore extends PizzaStore {

  	Pizza createPizza(String item) {
          	if (item.equals("cheese")) {
              		return new ChicagoStyleCheesePizza();
          	} else if (item.equals("veggie")) {
          	    	return new ChicagoStyleVeggiePizza();
          	} else if (item.equals("clam")) {
          	    	return new ChicagoStyleClamPizza();
          	} else if (item.equals("pepperoni")) {
              		return new ChicagoStylePepperoniPizza();
          	} else return null;
  	}
  }
  public abstract class Pizza {
  	String name;
  	String dough;
  	String sauce;
  	ArrayList<String> toppings = new ArrayList<String>();

  	void prepare() {
  		System.out.println("Prepare " + name);
  		System.out.println("Tossing dough...");
  		System.out.println("Adding sauce...");
  		System.out.println("Adding toppings: ");
  		for (String topping : toppings) {
  			System.out.println("   " + topping);
  		}
  	}

  	void bake() {
  		System.out.println("Bake for 25 minutes at 350");
  	}

  	void cut() {
  		System.out.println("Cut the pizza into diagonal slices");
  	}

  	void box() {
  		System.out.println("Place pizza in official PizzaStore box");
  	}

  	public String getName() {
  		return name;
  	}

  	public String toString() {
  		StringBuffer display = new StringBuffer();
  		display.append("---- " + name + " ----\n");
  		display.append(dough + "\n");
  		display.append(sauce + "\n");
  		for (String topping : toppings) {
  			display.append(topping + "\n");
  		}
  		return display.toString();
  	}
  }
  public class ChicagoStyleCheesePizza extends Pizza {

  	public ChicagoStyleCheesePizza() {
  		name = "Chicago Style Deep Dish Cheese Pizza";
  		dough = "Extra Thick Crust Dough";
  		sauce = "Plum Tomato Sauce";

  		toppings.add("Shredded Mozzarella Cheese");
  	}

  	void cut() {
  		System.out.println("Cutting the pizza into square slices");
  	}
  }
  public class ChicagoStyleClamPizza extends Pizza {
  	public ChicagoStyleClamPizza() {
  		name = "Chicago Style Clam Pizza";
  		dough = "Extra Thick Crust Dough";
  		sauce = "Plum Tomato Sauce";

  		toppings.add("Shredded Mozzarella Cheese");
  		toppings.add("Frozen Clams from Chesapeake Bay");
  	}

  	void cut() {
  		System.out.println("Cutting the pizza into square slices");
  	}
  }
  public class ChicagoStylePepperoniPizza extends Pizza {
  	public ChicagoStylePepperoniPizza() {
  		name = "Chicago Style Pepperoni Pizza";
  		dough = "Extra Thick Crust Dough";
  		sauce = "Plum Tomato Sauce";

  		toppings.add("Shredded Mozzarella Cheese");
  		toppings.add("Black Olives");
  		toppings.add("Spinach");
  		toppings.add("Eggplant");
  		toppings.add("Sliced Pepperoni");
  	}

  	void cut() {
  		System.out.println("Cutting the pizza into square slices");
  	}
  }
  public class ChicagoStyleVeggiePizza extends Pizza {
  	public ChicagoStyleVeggiePizza() {
  		name = "Chicago Deep Dish Veggie Pizza";
  		dough = "Extra Thick Crust Dough";
  		sauce = "Plum Tomato Sauce";

  		toppings.add("Shredded Mozzarella Cheese");
  		toppings.add("Black Olives");
  		toppings.add("Spinach");
  		toppings.add("Eggplant");
  	}

  	void cut() {
  		System.out.println("Cutting the pizza into square slices");
  	}
  }
}
