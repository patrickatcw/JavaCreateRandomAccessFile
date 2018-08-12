package com.me;

import java.io.IOException;
import java.io.RandomAccessFile;

public class IncrementRead {

    public static void incrementReadCounter(RandomAccessFile raf)
            throws IOException {
        long currentPosition = raf.getFilePointer();
        raf.seek(0);
        int counter = raf.readInt();
        counter++;
        raf.seek(0);
        raf.writeInt(counter);
        raf.seek(currentPosition);
    }

}
