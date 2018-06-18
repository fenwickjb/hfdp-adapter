

public class Demo {
 
    public static void main(String[] args) {
	PizzaStore store = null;
	String pizzaName = null;
	boolean argsProblems = false;

	if (args.length == 2) {
	    if ("ny".equals(args[0]))
		store = new NYPizzaStore();
	    else if ("frozen".equals(args[0]))
		store = new HeadstonePizzaStore();
	    else {
		System.out.println("First arg is store: \"ny\" or \"frozen\"");
		System.out.println("Using default: ny.");
		store = new NYPizzaStore();
	    }
	    pizzaName = args[1];
	}
	else {
	    System.out.println("First arg is store: \"ny\" or \"frozen\"");
	    System.out.println("Second arg is pizza: "
			       + "\"cheese\" or \"pepperoni\"");
	    System.out.println("Using defaults: ny cheese.");
	    store = new NYPizzaStore();
	    pizzaName = "cheese";
	}

	System.out.println("Ordering you a " + pizzaName + " pizza.\n");
	Pizza pizza = store.orderPizza(pizzaName);
	System.out.println("\nYou are enjoying a " + pizza.getName() + ".\n");
    }
}
