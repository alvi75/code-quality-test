using System;
using System.Collections.Generic;

public class Translation197
{
    public virtual int GetCellsVal(){
    int size = 0;
    foreach (char c in cells.Keys){
        Cell e = At(c);
        if (e.cmd >= 0){
            size++;
        }
    }
    return size;
}
}