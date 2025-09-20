using System;
using System.Collections.Generic;

public class Translation418
{
    public override String ToString(){
    StringBuilder buffer = new StringBuilder();
    buffer.Append("[DCONREF]\n");
    buffer.Append(" .options = ").Append("0x").Append(HexDump.ToHex(Options)).Append(" (").Append(Options).Append(" )");
    buffer.Append(Environment.NewLine);
    buffer.Append(" .horizontalBorder = ").Append(IsHorizontalBorder()).Append('\n');
    buffer.Append(" .verticalBorder = ").Append(IsVerticalBorder()).Append('\n');
    buffer.Append(" .border = ").Append(IsBorder()).Append('\n');
    buffer.Append(" .showSeriesKey = ").Append(IsShowSeriesKey()).Append('\n');
    buffer.Append("[/DCONREF]\n");
    return buffer.ToString();
}
}