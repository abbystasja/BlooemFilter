package com.abby;

public class Processor {

    public static void main(String[] args) {
        Interaction p = new Interaction();
        p.fillBitSet("wordlist.txt");
        p.processConsoleInput();
    }



}

