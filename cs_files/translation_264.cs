using System;
using System.Collections.Generic;

public class Translation264
{
    Token GetToken(int index){
    Token t = token;
    for (int i = 0;
    i < index;
    i++){
        if (t.Next != null) t = t.Next;
        else t = t.Next = tokenSource.GetNextToken();
    }
    return t;
}
}