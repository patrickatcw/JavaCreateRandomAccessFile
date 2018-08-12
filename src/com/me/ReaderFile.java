package com.me;

import java.io.IOException;
import java.io.RandomAccessFile;

public class ReaderFile {

    public static void readFile(String fileName) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
        int counter = raf.readInt();
        String msg = raf.readUTF();

        System.out.println(counter);
        System.out.println(msg);
        IncrementRead.incrementReadCounter(raf);
        raf.close();
    }

}
