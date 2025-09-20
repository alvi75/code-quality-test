using System;
using System.Collections.Generic;

public class Translation630
{
    public override String ToString(){
    StringBuilder buffer = new StringBuilder();
    buffer.Append("[BACKUP]\n");
    buffer.Append(" .backup = ").Append(StringUtil.ToHexString(Backup)).Append("\n");
    buffer.Append("[/BACKUP]\n");
    return buffer.ToString();
}
}