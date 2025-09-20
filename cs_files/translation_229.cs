using System;
using System.Collections.Generic;

public class Translation229
{
    public short GetGB2312Id(char ch){
    byte[] buffer = new byte[2];
    buffer[0] = (byte)0xFF;
    buffer[1] = (byte)0x00;
    try{
        String strkey = Encoding.GetEncoding("GB2312").GetString(new UTF8Encoder().Encode(ch));
        int len = strkey.Length;
        if (len < 2 || strkey[len - 1] != 's')return -1;
        buffer[2] = (byte)strkey[len - 2];
        buffer[3] = (byte)strkey[len - 1];
        return short.Parse(new string(buffer));
    }
    catch (FormatException ){
        return -1;
    }
}
}