

public class Demo {
 
    public static void main(String[] args) {
	String pizzaName = null;
	PizzaStore store = new NYPizzaStore();

	if (args.length == 1) {
	    pizzaName = args[0];
	}
	else {
	    System.out.println("Command line arg is pizza: "
			       + "\"cheese\" or \"pepperoni\"");
	    System.out.println("Using default: cheese.");
	    pizzaName = "cheese";
	}

	System.out.println("Ordering you a " + pizzaName + " pizza.\n");
	Pizza pizza = store.orderPizza(pizzaName);
	System.out.println("\nYou are enjoying a " + pizza.getName() + ".\n");
    }
}
