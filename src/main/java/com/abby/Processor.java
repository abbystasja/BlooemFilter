package com.abby;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        Processor p = new Processor();
        p.runBitSetFilling();
        p.wordsExistanceVerification();
    }

    public void wordsExistanceVerification(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter word you want to verify");
            String input = sc.nextLine();
            System.out.println(bitSetRealisation.isWordExists(input));
        } while(true);


    }

}
