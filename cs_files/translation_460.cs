using System;
using System.Collections.Generic;

public class Translation460
{
    public override void write(char[] buffer, int offset, int len){
    java.util.Arrays.checkOffsetAndCount(buffer.Length, offset, len);
    lock (@lock){
        expand(len);
        System.Array.Copy(buffer, offset, this.buf, this.count, len);
        this.count += len;
    }
}
}