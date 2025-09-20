using System;
using System.Collections.Generic;

public class Translation518
{
    public static void StrCpy(char[] dst, int di, char[] src, int si){
    while (src[si] != 0){
        dst[di++] = src[si++];
    }
    dst[di] = (char)0;
}
}