import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class SumTest {
    @Test
    public void getSum(){
        Calculator suntest=new Calculator();

        int value=suntest.Sum(10,10);

        assertEquals(20,value);
    }

}
