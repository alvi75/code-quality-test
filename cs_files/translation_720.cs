using System;
using System.Collections.Generic;

public class Translation720
{
    public Cell Merge(Cell m, Cell e){
    if (m.cmd == e.cmd && m.@ref == e.@ref && m.skip == e.skip){
        Cell c = new Cell(m);
        c.cnt += e.cnt;
        return c;
    }
    else{
        return null;
    }
}
}