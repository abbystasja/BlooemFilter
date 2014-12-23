package com.abby;

import java.util.BitSet;

public class BitSetRealisation {

    private BitSet wordSet = new BitSet(Integer.MAX_VALUE);

    public BitSetRealisation() {
    }

    public int getStringHashCode(String str){
        if(str == null){
            return 0;
        }
        else return Math.abs(str.hashCode());
    }

    public void addWordToSet(String str){
        wordSet.set(getStringHashCode(str));
    }

    public boolean isWordExists(String str){
        return wordSet.get(getStringHashCode(str));
    }

}
