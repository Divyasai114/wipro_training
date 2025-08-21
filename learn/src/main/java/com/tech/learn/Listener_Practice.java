package com.tech.learn;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.tech.learn.MyListener_report.class)
public class Listener_Practice {
    @Test
    public void simpleTest() {
        Assert.assertTrue(true, "This test should always pass.");
    }
}