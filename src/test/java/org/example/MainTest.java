package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class MainTest extends TestCase {


    public void testM1() {
        Main a = new Main();
        a.m1();
        a.getData();
        assertTrue(true);
    }

    public static Test suite() {
        return new TestSuite(MainTest.class);
    }
}