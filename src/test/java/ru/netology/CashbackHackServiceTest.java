package ru.netology;

import org.testng.Assert;
import org.testng.annotations.Test;

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
    public void  testRemainWhenAmountIs1500() {
        int amount = 1500;
        int expected = 500;
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