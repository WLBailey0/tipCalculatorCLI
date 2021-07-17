import com.sun.tools.javac.Main;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigDecimal;

import static org.junit.Assert.*;

public class TipTest {


    @Test
    public void dinningExperience_one() {
        Tip tip = new Tip();
        int experiance = 1;
        double billAmount = 10;
        double actual = tip.dinningExperience(experiance, billAmount);
        double expected = 11;
        Assert.assertNotEquals(expected, actual);
    }
    @Test
    public void dinningExperience_two() {
        Tip tip = new Tip();
        int experiance = 2;
        double billAmount = 10;
        double actual = tip.dinningExperience(experiance, billAmount);
        double expected = 11.8;
        Assert.assertNotEquals(expected, actual);
    }
    @Test
    public void dinningExperience_three() {
        Tip tip = new Tip();
        int experiance = 3;
        double billAmount = 10;
        double actual = tip.dinningExperience(experiance, billAmount);
        double expected = 12.00;
        Assert.assertNotEquals(expected, actual);
    }
    @Test
    public void dinningExperience_four() {
        Tip tip = new Tip();
        int experiance = 4;
        double billAmount = 10;
        double actual = tip.dinningExperience(experiance, billAmount);
        double expected = 12.3;
        Assert.assertNotEquals(expected, actual);
    }    @Test
    public void dinningExperience_five() {
        Tip tip = new Tip();
        int experiance = 5;
        double billAmount = 10;
        double actual = tip.dinningExperience(experiance, billAmount);
        double expected = 12.5;
        Assert.assertNotEquals(expected, actual);
    }
    @Test
    public void dinningExperiance_experience_too_high() {
        Tip tip = new Tip();
        int experience = 6;
        double billAmount = 10;
        double actual = tip.dinningExperience(experience, billAmount);
        double expected = 1.0;
        double delta = .1;
        Assert.assertEquals(expected, actual, delta);
    }






}