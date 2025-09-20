using System;
using System.Collections.Generic;

public class Translation520
{
    public static int NumNonNullable(object[] data){
    int n = 0;
    if (data == null){
        return n;
    }
    for (int i = 0;
    i < data.Length;
    i++){
        n += IsNonNull(data[i]);
    }
    return n;
}
}