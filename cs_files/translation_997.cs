using System;
using System.Collections.Generic;

public class Translation997
{
    public override String ToString(){
    StringBuilder buffer = new StringBuilder();
    buffer.Append("[SERIESLIST]\n");
    buffer.Append(" .numSeries = ").Append("0x").Append(HexDump.ToHex(NumSeries)).Append(" (").Append(NumSeries).Append(" )");
    buffer.Append(Environment.NewLine);
    buffer.Append(" .listType = ").Append("0x").Append(HexDump.ToHex(ListType)).Append(" (").Append(ListType).Append(" )");
    buffer.Append(Environment.NewLine);
    buffer.Append(" .hasMultibyte = ").Append(IsMultibyte).Append('\n');
    buffer.Append(" .language = ").Append("0x").Append(HexDump.ToHex(LanguageCode)).Append(" (").Append(LanguageCode).Append(" )");
    buffer.Append(Environment.NewLine);
    buffer.Append("[/SERIESLIST]\n");
    return buffer.ToString();
}
}