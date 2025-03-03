package ru.netology;

import org.junit.Test;
import org.junit.Assert;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void testRemainWhenAmountIsLessThen1000() {
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

//    @Test
//    public void testRemainWhenAmountIs1000() {
//        int amount = 1000;
//        int expected = 0;
//        int actual = service.remain(amount);
//        Assert.assertEquals(actual, expected);
//    }

    @Test
    public void testRemainWhenAmountIsOver1000() {
        int amount = 1999;
        int expected = 1;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void testRemainWhenAmountIs0() {
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);
        Assert.assertEquals(actual, expected);
    }

}