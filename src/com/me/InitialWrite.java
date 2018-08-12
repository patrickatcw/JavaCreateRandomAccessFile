package com.me;

import java.io.IOException;
import java.io.RandomAccessFile;

public class InitialWrite {


    public static void initialWrite(String fileName) throws IOException {
        RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
        raf.writeInt(0);
        raf.writeUTF("Hello world!");
        raf.close();
    }

}
