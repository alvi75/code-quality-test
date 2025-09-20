using System;
using System.Collections.Generic;

public class Translation16
{
    public override int read(byte[] buffer, int offset, int length){
    lock (this){
        if (buffer == null){
            throw new System.ArgumentNullException("buffer == null");
        }
        java.util.Arrays.checkOffsetAndCount(buffer.Length, offset, length);
        if (length == 0){
            return 0;
        }
        int copylen = count - pos < length ? count - pos : length;
        {
            for (int i = 0;
            i < copylen;
            i++){
                buffer[offset + i] = (byte)this.buffer[pos + i];
            }
        }
        pos += copylen;
        return copylen;
    }
}
}