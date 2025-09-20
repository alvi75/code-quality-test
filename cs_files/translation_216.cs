using System;
using System.Collections.Generic;

public class Translation216
{
    public static java.nio.CharBuffer wrap(char[] array_1, int start, int charCount){
    java.util.Arrays.checkOffsetAndCount(array_1.Length, start, charCount);
    java.nio.CharBuffer buf = new java.nio.ReadWriteCharArrayBuffer(array_1);
    buf._position = start;
    buf._limit = start + charCount;
    return buf;
}
}