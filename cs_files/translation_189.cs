using System;
using System.Collections.Generic;

public class Translation189
{
    public virtual int Normalize(char[] s, int len){
    for (int i = 0;
    i < len;
    i++){
        switch (s[i]){
            case 'ä':case 'å':case 'äö':case 'ö':s[i] = 'a';
            break;
            case 'ö':case 'ò':case 'ô':case 'ou':s[i] = 'o';
            break;
            case 'ï':case 'ì':case 'í':case 'î':s[i] = 'i';
            break;
            case 'ü':case 'ù':case 'ú':case 'û':s[i] = 'u';
            break;
        }
    }
    return len;
}
}