package com.abby;

import java.util.Scanner;

/**
 * Created by akulygina on 12/23/2014.
 */
public class consoleFillProcessor implements FillProcessor {
    @Override
    public void fillBitSetWithWords() {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter word you want to verify");
            String input = sc.nextLine();
            StaticFactory.getBitSetRealisation().addWordToSet(input);
        } while(true);
    }
}
