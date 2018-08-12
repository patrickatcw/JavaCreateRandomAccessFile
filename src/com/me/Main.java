package com.me;

//http://www.java2s.com/Tutorials/Java/Java_io/0600__Java_io_Random_Access_Files.htm


import java.io.File;
import java.io.IOException;

import static com.me.InitialWrite.initialWrite;

public class Main {

    public static void main(String[] args) throws IOException {

        String fileName = "randomaccessfile.txt";
        File fileObject = new File(fileName);

        if (!fileObject.exists()) {
            InitialWrite.initialWrite(fileName);

        }

        ReaderFile.readFile(fileName);
        ReaderFile.readFile(fileName);
        ReaderFile.readFile(fileName);
        ReaderFile.readFile(fileName);

    }
}

//results
/*
0
Hello world!
1
Hello world!
2
Hello world!
3
Hello world!
 */
