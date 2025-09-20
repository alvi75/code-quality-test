using System;
using System.Collections.Generic;

public class Translation664
{
    public override String ToString(){
    StringBuilder buffer = new StringBuilder();
    buffer.Append("[SXVDEX]\n");
    buffer.Append(" .grbit1 =").Append(StringUtil.ToHexString(grbit1)).Append("\n");
    buffer.Append(" .grbit2 =").Append(StringUtil.ToHexString(grbit2)).Append("\n");
    buffer.Append(" .citmShow =").Append(StringUtil.ToHexString(citmShow)).Append("\n");
    buffer.Append(" .isxdiSort =").Append(StringUtil.ToHexString(isxdiSort)).Append("\n");
    buffer.Append(" .isxdiShow =").Append(StringUtil.ToHexString(isxdiShow)).Append("\n");
    buffer.Append(" .subtotalName =").Append(subtotalName).Append("\n");
    buffer.Append("[/SXVDEX]\n");
    return buffer.ToString();
}
}