using System;
using System.Collections.Generic;

public class Translation911
{
    public override String ToString(){
    StringBuilder sb = new StringBuilder(64);
    sb.Append(GetType().Name).Append(" [");
    sb.Append("sid=").Append(HexDump.ShortToHex(_sid));
    sb.Append(" size=").Append(_data.Length);
    sb.Append(" : ").Append(HexDump.ToHex(_data));
    sb.Append("]");
    return sb.ToString();
}
}