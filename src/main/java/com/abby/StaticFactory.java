package com.abby;

/**
 * This factory for now provides simple getting of WordBitSet instance
 */
public class StaticFactory {
    private static final WordBitSet wordBitSet = new WordBitSet();

    public static WordBitSet getWordBitSet() {
        return wordBitSet;
    }
}
