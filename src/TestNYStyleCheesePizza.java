/* 
 * JUnit5 test class
 */

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;


public class TestNYStyleCheesePizza {
    
    @Test
    public void testNYStyleCheesePizza() {
	// Class only contains a constructor
	// Will construct and then call inherited
	// toString method to verify all constructor fields
	// assigned properly

	String expectedName = "NY Style Sauce and Cheese Pizza";
	String expectedDough = "Thin Crust Dough";
	String expectedSauce = "Marinara Sauce";
	String expectedToppings = "Grated Reggiano Cheese";

	StringBuffer expectedDisplay = new StringBuffer();
	expectedDisplay.append("---- " + expectedName + " ----\n");
	expectedDisplay.append(expectedDough + "\n");
	expectedDisplay.append(expectedSauce + "\n");
	expectedDisplay.append(expectedToppings + "\n");
	String expecting = expectedDisplay.toString();

	NYStyleCheesePizza p = new NYStyleCheesePizza();
	String actual = p.toString();

	assertEquals(expecting, actual);
    }
}
