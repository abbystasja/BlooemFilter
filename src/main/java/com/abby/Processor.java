package com.abby;

/**
 * Simple class for running from console
 * It provides reading all files from proposed file
 * And then verification for all words entered from keyboard
 */
public class Processor {

    public static void main(String[] args) {
        Interaction p = new Interaction();
        p.fillBitSet("wordlist.txt");
        p.processConsoleInput();
    }
}

