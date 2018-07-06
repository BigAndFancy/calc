import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SubTest {
    @Test
    public void getSub(){
        Calculator subtest=new Calculator();

        int value=subtest.Sub(10,10);

        assertEquals(0,value);
    }
}
