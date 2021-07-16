import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class TipTest {

    @org.junit.Test
    public void dinningExperiance_Big_number() {
        Tip tip = new Tip();
        int experiance = 6;
        double billAmount = 12.32;
        double actual = tip.dinningExperiance(experiance, billAmount);
        int expected = 12;
        Assert.assertNotEquals(expected, actual);
    }

}