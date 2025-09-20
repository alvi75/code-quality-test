using System;
using System.Collections.Generic;

public class Translation44
{
    public override string ToString(){
    java.lang.StringBuilder b = new java.lang.StringBuilder();
    int l = length();
    {
        for (int i = 0;
        i < l;
        i++){
            b.append(getComponent(i));
            if (i < l - 1){
                b.append(' ');
            }
        }
    }
    return b.ToString();
}
}