import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class DivTest {
    @Test
    public void getDiv(){
        Calculator divtest=new Calculator();

        int value=divtest.Div(10,10);

        assertEquals(1,value);
    }
}
