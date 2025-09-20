using System;
using System.Collections.Generic;

public class Translation702
{
    public override void Next(int delta){
    while (--delta >= 0){
        if (currentSubtree != null){
            ptr += currentSubtree.GetEntrySpan();
        }
        else{
            ptr++;
        }
        if (Eof){
            break;
        }
        ParseEntry();
    }
}
}