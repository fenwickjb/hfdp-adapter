/* 
 * JUnit5 test class
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


public class TestNYPizzaStore {

    static NYPizzaStore store;

    @BeforeEach
    public void createStore() {
	store = new NYPizzaStore();
    }
    
    @Test
    public void testCreatePizzaCheese() {
	Pizza p = store.createPizza("cheese");
	assertTrue(p instanceof NYStyleCheesePizza);
    }

    @Test
    public void testCreatePizzaPepperoni() {
	Pizza p = store.createPizza("pepperoni");
	assertTrue(p instanceof NYStylePepperoniPizza);
    }

    @Test
    public void testCreatePizzaNull() {
	Pizza p = store.createPizza("unknown variety");
	assertNull(p);
    }
}
