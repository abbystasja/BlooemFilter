package com.abby;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Interaction {

    public void processConsoleInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter word you want to verify");
        while (sc.hasNextLine()) {
            String input = sc.nextLine();
            input = input.trim();
            System.out.println(StaticFactory.getBitSetRealisation().hasWord(input));
            System.out.println("Enter word you want to verify");
        }
    }

    private void processLine(String s) {
        s = s.trim();
        Pattern p = Pattern.compile("^\\w+$");
        Matcher m = p.matcher(s);
        if (m.matches()) {
            StaticFactory.getBitSetRealisation().addWord(s);
        }
    }

    public void fillBitSet(String fileName) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
            String line;
            while ((line = reader.readLine()) != null) {
                processLine(line);
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
