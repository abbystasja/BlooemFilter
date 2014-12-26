package com.abby;

import junit.framework.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Created by akulygina on 12/26/2014.
 */
public class InteractionTest {

    @BeforeClass
    public static void initObjects() {
        Interaction interaction = new Interaction();
        interaction.fillBitSet("src/test/resources/wordlist.txt");
    }

    @Test
      public void simpleCheckWordTest() {
        Interaction interaction = new Interaction();
        Assert.assertTrue(interaction.checkWord("quackisms"));
    }

    @Test
    public void trimmedCheckWordTest() {
        Interaction interaction = new Interaction();
        Assert.assertTrue(interaction.checkWord("     quackisms"));
    }

    @Test
    public void nullCheckWordTest() {
        Interaction interaction = new Interaction();
        Assert.assertFalse(interaction.checkWord(null));
    }

    @Test
    public void emptyCheckWordTest() {
        Interaction interaction = new Interaction();
        Assert.assertFalse(interaction.checkWord(""));
    }

    @Test
    public void negativeCheckWordTest() {
        Interaction interaction = new Interaction();
        Assert.assertFalse(interaction.checkWord("1quackisms"));
    }
}
