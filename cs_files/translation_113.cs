using System;
using System.Collections.Generic;

public class Translation113
{
    public static byte[] ToBigEndianUtf16Bytes(char[] chars, int offset, int length){
    byte[] result = new byte[length * 2];
    int end = offset + length;
    int resultIndex = 0;
    for (int i = offset;
    i < end;
    ++i){
        char ch = chars[i];
        result[resultIndex++] = (byte)((uint)ch >> 8);
        result[resultIndex++] = unchecked((byte)ch);
    }
    return result;
}
}