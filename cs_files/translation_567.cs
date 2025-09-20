using System;
using System.Collections.Generic;

public class Translation567
{
    public static bool IsValidSchemeChar(int index, char c){
    if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')){
        return true;
    }
    if (index > 0 && ((c >= '0' && c <= '9') || c == '+' || c == '-' || c == '.')){
        return true;
    }
    return false;
}
}