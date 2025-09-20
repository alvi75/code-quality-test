using System;
using System.Collections.Generic;

public class Translation34
{
    public static string Quote(string @in){
    StringBuilder r = new StringBuilder();
    r.Append('\\');
    int start = 0;
    int i = 0;
    for (;
    i < @in.Length;
    i++){
        switch (@in[i]){
            case '\\':{
                if (start == i){
                    r.Append('\\');
                }
                else{
                    r.Append('\\');
                    r.Append(@in[start]);
                }
                start = i + 1;
                break;
            }
            default:{
                r.Append(@in[i]);
            }
        }
    }
}
return r.ToString();
}
}