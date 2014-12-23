package com.abby;

import java.io.*;

/**
 * Created by akulygina on 12/23/2014.
 */
public class FileFillProcessor implements FillProcessor {

    private final String fileName = "wordlist.txt";

    @Override
    public void fillBitSetWithWords() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(new File(fileName)));
            String line;
            while ((line = br.readLine()) != null) {
                StaticFactory.getBitSetRealisation().addWordToSet(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("No file" + fileName + "exists");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("There were some issues from reading from file " + fileName);
            e.printStackTrace();
        }
    }
}
