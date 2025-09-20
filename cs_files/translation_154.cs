using System;
using System.Collections.Generic;

public class Translation154
{
    public static short LookupIndexByName(String name){
    FunctionMetadata fd = GetFunctionByIndex((int)name);
    if (fd == null){
        fd = GetFunctionByIndex((int)name.ToUpper());
        if (fd == null){
            return -1;
        }
    }
    return (short)fd.Index;
}
}