package com.abby;

/**
 * Created by akulygina on 12/23/2014.
 */
public class StaticFactory {
    private static final WordBitSet bitSetRealisation = new WordBitSet();

    public static WordBitSet getBitSetRealisation() {
        return bitSetRealisation;
    }
}
