using System;
using System.Collections.Generic;

public class Translation709
{
    public override String ToString(){
    StringBuilder sb = new StringBuilder(64);
    CellReference crA = new CellReference(_firstRow, _firstColumn, false, false);
    CellReference crB = new CellReference(_lastRow, _lastColumn, false, false);
    sb.Append(GetType().Name);
    sb.Append(" [").Append(crA.FormatAsString()).Append(':').Append(crB.FormatAsString()).Append("]");
    return sb.ToString();
}
}