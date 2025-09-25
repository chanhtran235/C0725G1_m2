import mvc.Calculator;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
 Calculator calculator = new Calculator();
 @Test
    public void  test1(){
     assertEquals(10,calculator.sum(5,5));
 }

}
