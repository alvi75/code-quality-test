using System;
using System.Collections.Generic;

public class Translation504
{
    public override String ToString(){
    StringBuilder buffer = new StringBuilder();
    buffer.Append("[FtCbls ]\n");
    buffer.Append(" size = ").Append(DataSize).Append("\n");
    buffer.Append(" flags = ").Append(HexDump.ToHex(flags)).Append("\n");
    buffer.Append("[/FtCbls ]\n");
    return buffer.ToString();
}
}