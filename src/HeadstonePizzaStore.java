
public class HeadstonePizzaStore extends PizzaStore {

    Pizza createPizza(String item) {
	return new FrozenPizzaAdapter(item);
    }
}
