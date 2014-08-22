package com.slava.skiena;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by slavic on 8/21/14.
 */
public class StringPatternMatchingTest {

    @Test
    public void testStringPatternMatching() {
        String text = "0123456789";

        Assert.assertEquals(-1, StringPatternMatching.findMatch(text, "012X"));
        Assert.assertEquals(0, StringPatternMatching.findMatch(text, "012"));
        Assert.assertEquals(3, StringPatternMatching.findMatch(text, "34567"));
        Assert.assertEquals(-1, StringPatternMatching.findMatch(text, "345X67"));
        Assert.assertEquals(7, StringPatternMatching.findMatch(text, "789"));
        Assert.assertEquals(-1, StringPatternMatching.findMatch(text, "789X"));
    }
}
