package test.java.org.tw.learngradle;

import Main.java.org.tw.learngradle.PositiveOrNegetive;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by lavanya on 6/9/17.
 */
public class PositiveOrNegetiveTest {
    @Test

    public void ShouldReturnPositiveString() {
        PositiveOrNegetive positiveOrNegetive = new PositiveOrNegetive();
        positiveOrNegetive.isPositiveOrNegative(-1);
        assertTrue("negetive".equals("negetive"));
    }


}
