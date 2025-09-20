using System;
using System.Collections.Generic;

public class Translation601
{
    public static int GetEncodedSize(object[] values){
    int result = values.Length * 1;
    for (int i = 0;
    i < values.Length;
    i++){
        result += GetEncodedSize(values[i]);
    }
    return result;
}
}