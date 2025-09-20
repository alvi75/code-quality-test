using System;
using System.Collections.Generic;

public class Translation536
{
    public bool Contains(int row, int col){
    return (_firstRow <= row) && (_lastRow >= row) && (_firstColumn <= col) && (_lastColumn >= col);
}
}