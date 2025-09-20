using System;
using System.Collections.Generic;

public class Translation678
{
    public static int Prev(byte[] b, int ptr, char chrA){
    if (ptr == b.Length){
        --ptr;
    }
    while (ptr >= 0){
        if (b[ptr--] == chrA){
            return ptr;
        }
    }
    return ptr;
}
}