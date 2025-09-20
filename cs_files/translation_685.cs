using System;
using System.Collections.Generic;

public class Translation685
{
    public static int TrimTrailingWhitespace(byte[] raw, int start, int end){
    var ptr = end - 1;
    while (start <= ptr && IsWhitespace(raw[ptr])){
        ptr--;
    }
    return ptr + 1;
}
}