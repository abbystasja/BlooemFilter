package com.abby;

/**
 * Created by akulygina on 12/23/2014.
 */
public class StaticFactory {
    private static final BitSetRealisation bitSetRealisation = new BitSetRealisation();

    public static BitSetRealisation getBitSetRealisation() {
        return bitSetRealisation;
    }
}
