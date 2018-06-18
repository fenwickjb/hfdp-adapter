/* 
 * JUnit5 test class
 */

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.*;

import java.io.PrintStream;
import java.io.ByteArrayOutputStream;


public class TestPizza {

    // These fields are used to redirect and capture System.out
    static PrintStream originalOut;
    static ByteArrayOutputStream baos;
    static PrintStream newOut;

    // Pizza object to test
    Pizza testPizza;

    private void prepPrintln() {
	originalOut = System.out;
	baos = new ByteArrayOutputStream();
	newOut = new PrintStream(baos);
	System.setOut(newOut);
    }

    @Test
    public void testNoToppingsDisplay() {
	String expectedOutput = "---- " + "Name" + " ----\n"; 
	expectedOutput += "Dough With Spaces" + "\n";
	expectedOutput += "Sauce" + "\n";

	Pizza testPizza = new NoToppingPizza();
	String actualOutput = testPizza.toString();

	assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testOneToppingsDisplay() {
	String expectedOutput = "---- " + "Name" + " ----\n"; 
	expectedOutput += "Dough With Spaces" + "\n";
	expectedOutput += "Sauce" + "\n";
	expectedOutput += "Topping Space Name" + "\n";

	Pizza testPizza = new OneToppingPizza();
	String actualOutput = testPizza.toString();

	assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testThreeToppingsDisplay() {
	String expectedOutput = "---- " + "Name" + " ----\n"; 
	expectedOutput += "Dough With Spaces" + "\n";
	expectedOutput += "Sauce" + "\n";
	expectedOutput += "Topping1 Space Name" + "\n";
	expectedOutput += "Topping2" + "\n";
	expectedOutput += "Topping3" + "\n";

	Pizza testPizza = new ThreeToppingPizza();
	String actualOutput = testPizza.toString();

	assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testNoToppingsPrepare() {
	String expectedOutput = "Prepare " + "Name" + "\n";
	expectedOutput += "Tossing dough..." + "\n";
	expectedOutput += "Adding sauce..." + "\n";
	expectedOutput += "Adding toppings: " + "\n";

	prepPrintln();
	Pizza testPizza = new NoToppingPizza();
	testPizza.prepare();

	System.out.flush();
	String actualOutput = baos.toString();
	System.setOut(originalOut);

	assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testOneTopping() {
	String expectedOutput = "Prepare " + "Name" + "\n";
	expectedOutput += "Tossing dough..." + "\n";
	expectedOutput += "Adding sauce..." + "\n";
	expectedOutput += "Adding toppings: " + "\n";
	expectedOutput += "   Topping Space Name" + "\n";

	prepPrintln();
	Pizza testPizza = new OneToppingPizza();
	testPizza.prepare();

	System.out.flush();
	String actualOutput = baos.toString();
	System.setOut(originalOut);

	assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testThreeToppings() {
	String expectedOutput = "Prepare " + "Name" + "\n";
	expectedOutput += "Tossing dough..." + "\n";
	expectedOutput += "Adding sauce..." + "\n";
	expectedOutput += "Adding toppings: " + "\n";
	expectedOutput += "   Topping1 Space Name" + "\n";
	expectedOutput += "   Topping2" + "\n";
	expectedOutput += "   Topping3" + "\n";

	prepPrintln();
	Pizza testPizza = new ThreeToppingPizza();
	testPizza.prepare();

	System.out.flush();
	String actualOutput = baos.toString();
	System.setOut(originalOut);

	assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testBake() {
	String expectedOutput = "Bake for 25 minutes at 350\n";
	
	prepPrintln();
	Pizza testPizza = new OneToppingPizza();
	testPizza.bake();

	System.out.flush();
	String actualOutput = baos.toString();
	System.setOut(originalOut);

	assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testCut() {
	String expectedOutput = "Cut the pizza into diagonal slices\n";
	
	prepPrintln();
	Pizza testPizza = new OneToppingPizza();
	testPizza.cut();

	System.out.flush();
	String actualOutput = baos.toString();
	System.setOut(originalOut);

	assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testBox() {
	String expectedOutput = "Place pizza in official PizzaStore box\n";
	
	prepPrintln();
	Pizza testPizza = new OneToppingPizza();
	testPizza.box();

	System.out.flush();
	String actualOutput = baos.toString();
	System.setOut(originalOut);

	assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void testGetName() {
	Pizza testPizza = new OneToppingPizza();
	assertEquals("Name", testPizza.getName());
    }

}

class OneToppingPizza extends Pizza {
    public OneToppingPizza() {
	name = "Name";
	dough = "Dough With Spaces";
	sauce = "Sauce";
	toppings.add("Topping Space Name");
    }
}
class NoToppingPizza extends Pizza {
    public NoToppingPizza() {
	name = "Name";
	dough = "Dough With Spaces";
	sauce = "Sauce";
    }
}
class ThreeToppingPizza extends Pizza {
    public ThreeToppingPizza() {
	name = "Name";
	dough = "Dough With Spaces";
	sauce = "Sauce";
	toppings.add("Topping1 Space Name");
	toppings.add("Topping2");
	toppings.add("Topping3");
    }
}


 
 
