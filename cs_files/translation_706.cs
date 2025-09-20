using System;
using System.Collections.Generic;

public class Translation706
{
    public override string ToString(){
    StringBuilder sb = new StringBuilder("[");
    foreach (object item in this){
        if (sb.Length > 1)sb.Append(", ");
        if (item is char[]){
            sb.Append((char[])item);
        }
        else{
            sb.Append(item);
        }
    }
    return sb.Append(']').ToString();
}
}