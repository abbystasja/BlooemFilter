package com.abby;

import java.io.*;
import java.util.Scanner;

public class Processor {

    private BitSetRealisation bitSetRealisation;

    public Processor() {
        bitSetRealisation = new BitSetRealisation();
    }

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

    public void runBitSetFilling() {
         try {
            File f = new File("wordlist.txt");
            BufferedReader br = new BufferedReader(new FileReader(f));
            String line;
            while ((line = br.readLine()) != null) {
                bitSetRealisation.addWordToSet(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
             e.printStackTrace();
         }
    }
}
