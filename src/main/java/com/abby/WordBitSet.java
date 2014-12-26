package com.abby;

import java.util.BitSet;

/**
 * This class provides realisation of BloomFilter Set
 * It's based on String's hashcode, that can be later replaced with other hashcode calculation
 * Was selected BitSet collection, as it's the only one collection that can directly work with array of bits
 */
public class WordBitSet {

    private BitSet knownWords = new BitSet(Integer.MAX_VALUE);

    public WordBitSet() {
    }

    private int getHashCode(String word){
        return (word == null) ? 0 : Math.abs(word.hashCode());
    }

    public void addWord(String str){
        knownWords.set(getHashCode(str));
    }

    public boolean hasWord(String str){
        return knownWords.get(getHashCode(str));
    }
}
