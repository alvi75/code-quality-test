using System;
using System.Collections.Generic;

public class Translation721
{
    public override java.nio.ByteBuffer read(int length, long position){
    if (position >= size){
        throw new System.IndexOutOfRangeException("Position " + position + " past the end of the file");
    }
    java.nio.ByteBuffer dst;
    if (writable){
        dst = channel.map(java.nio.FileChannel.MapMode.READ_WRITE, position, length);
        @lock.add(dst);
    }
    else{
        dst = java.nio.ByteBuffer.allocate(length);
        int worked = IOUtils.readFully(channel, dst);
        if (worked == -1){
            throw new System.IndexOutOfRangeException("Position " + position + " past the end of the file");
        }
        dst.position(0);
    }
    return dst;
}
}