/* 
 * JUnit5 test class
 */

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;


public class TestNYStylePepperoniPizza {
    
    @Test
    public void testNYStylePepperoniPizza() {
	// Class only contains a constructor
	// Will construct and then call inherited
	// toString method to verify all constructor fields
	// assigned properly

	String expectedName = "NY Style Pepperoni Pizza";
	String expectedDough = "Thin Crust Dough";
	String expectedSauce = "Marinara Sauce";
	String expectedTopping1 = "Grated Reggiano Cheese";
	String expectedTopping2 = "Sliced Pepperoni";
	String expectedTopping3 = "Garlic";
	String expectedTopping4 = "Onion";
	String expectedTopping5 = "Mushrooms";
	String expectedTopping6 = "Red Pepper";

	StringBuffer expectedDisplay = new StringBuffer();
	expectedDisplay.append("---- " + expectedName + " ----\n");
	expectedDisplay.append(expectedDough + "\n");
	expectedDisplay.append(expectedSauce + "\n");
	expectedDisplay.append(expectedTopping1 + "\n");
	expectedDisplay.append(expectedTopping2 + "\n");
	expectedDisplay.append(expectedTopping3 + "\n");
	expectedDisplay.append(expectedTopping4 + "\n");
	expectedDisplay.append(expectedTopping5 + "\n");
	expectedDisplay.append(expectedTopping6 + "\n");
	String expecting = expectedDisplay.toString();

	NYStylePepperoniPizza p = new NYStylePepperoniPizza();
	String actual = p.toString();

	assertEquals(expecting, actual);
    }
}
