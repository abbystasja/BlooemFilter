package com.abby;

import org.junit.Test;

/**
 * Created by akulygina on 12/23/2014.
 */
public class BitSetRealizationTest {

    @Test
    public void testGetStringHashCode(){
        BitSetRealisation bitSetRealisation = new BitSetRealisation();

        bitSetRealisation.addWordToSet("0");
        System.out.println(bitSetRealisation.isWordExists("0"));
        System.out.println(bitSetRealisation.isWordExists("0"));
    }
}
