package com.abby;

import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class WordBitSetTest {

    @Test
    public void addWordAndHasWordNullTest() {
        WordBitSet wordBitSet = new WordBitSet();
        wordBitSet.addWord(null);
        assertTrue(wordBitSet.hasWord(null));
    }

    @Test
    public void addWordAndHasWordEmptyTest() {
        WordBitSet wordBitSet = new WordBitSet();
        wordBitSet.addWord("");
        assertTrue(wordBitSet.hasWord(""));
    }

    @Test
    public void addWordAndHasWordBigTest() {
        WordBitSet wordBitSet = new WordBitSet();
        wordBitSet.addWord("sfkgnjknfgknsdkfgjkndsfgjknsdkjgknskgjntuskdjfnkjdfnkjsdk");
        assertTrue(wordBitSet.hasWord("sfkgnjknfgknsdkfgjkndsfgjknsdkjgknskgjntuskdjfnkjdfnkjsdk"));
    }

    @Test
    public void hasWordNegativeTest() {
        WordBitSet wordBitSet = new WordBitSet();
        assertFalse(wordBitSet.hasWord("sfkgnjknfgknsdkfgjkndsfgjknsdkjgknskgjntuskdjfnkjdfnkjsdk"));
    }



}
