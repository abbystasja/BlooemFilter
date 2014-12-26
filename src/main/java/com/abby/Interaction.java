package com.abby;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Interaction {

    private final String wordPattern = "^[\\w']+$";
    private final String enterYourWord = "Enter the word you want to verify";

    private boolean checkWord(String word) {
        word = word.trim();
        Pattern p = Pattern.compile(wordPattern);
        Matcher m = p.matcher(word);
        return m.matches() && StaticFactory.getBitSetRealisation().hasWord(word);
    }

    public void processConsoleInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println(enterYourWord);
        while (sc.hasNextLine()) {
            System.out.println(checkWord(sc.nextLine()));
            System.out.println(enterYourWord);
        }
    }

    public void fillBitSet(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
            String line;
            while ((line = reader.readLine()) != null) {
                StaticFactory.getBitSetRealisation().addWord(line);
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
