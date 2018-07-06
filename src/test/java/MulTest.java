import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class MulTest {
    @Test
    public void getMul(){
        Calculator multest=new Calculator();

        int value=multest.Mul(10,10);

        assertEquals(100,value);
    }
}
