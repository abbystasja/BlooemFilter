package com.abby;

import java.io.*;
import java.util.Scanner;

public class Interaction {

    private final String enterYourWord = "Enter the word you want to verify";

    public boolean checkWord(String word) {
        if(word == null){
            return false;
        }
        word = word.trim();
        return StaticFactory.getWordBitSet().hasWord(word);
    }

    public void processConsoleInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println(enterYourWord);
        while (sc.hasNextLine()) {
            System.out.println(checkWord(sc.nextLine()));
            System.out.println(enterYourWord);
        }
    }

    /**
     * Provides reading words from fileName
     * and putting them to our BloomFilter
     * @param fileName
     */
    public void fillBitSet(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
            String line;
            while ((line = reader.readLine()) != null) {
                StaticFactory.getWordBitSet().addWord(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("No such file: " + fileName);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("There were some issues with reading from file: " + fileName);
            e.printStackTrace();
        }
    }
}
