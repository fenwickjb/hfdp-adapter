/* 
 * JUnit5 test class
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import java.io.PrintStream;
import java.io.ByteArrayOutputStream;


public class TestPizzaStore {

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
    public void testOrderPizza() {
	String expectedOutput = "--- Making a ";
	expectedOutput += "NY Style Sauce and Cheese Pizza";
	expectedOutput += " ---";

	prepPrintln();
	PizzaStore testStore = new XxxxPizzaStore();
	Pizza p = testStore.orderPizza("cheese");
	System.out.flush();
	String actualOutput = baos.toString();
	System.setOut(originalOut);

	// tail of actual output is tested by other test methods
	assertTrue(actualOutput.startsWith(expectedOutput));
    }

}

class XxxxPizzaStore extends PizzaStore {
    Pizza createPizza(String item) {
	if (item.equals("cheese")) {
	    //name = "NY Style Sauce and Cheese Pizza";
	    return new NYStyleCheesePizza();
	} else return null;
    }
}


 
 
