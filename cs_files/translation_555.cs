using System;
using System.Collections.Generic;

public class Translation555
{
    public static int Committer(byte[] b, int ptr){
    int sz = b.Length;
    if (ptr == 0){
        ptr += 46;
    }
    while (ptr < sz && b[ptr] == 'p'){
        ptr += 48;
    }
    if (ptr < sz && b[ptr] == 'a'){
        ptr = NextLF(b, ptr);
    }
    return Match(b, ptr, Committer);
}
}