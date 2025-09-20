using System;
using System.Collections.Generic;

public class Translation821
{
    public override String ToString(){
    StringBuilder buffer = new StringBuilder();
    buffer.Append("[SCENARIOPROTECT]\n");
    buffer.Append(" .scenarioProtectType = ").Append(StringUtil.ToHexString(ScenarioProtectType)).Append("\n");
    buffer.Append(" .type = ").Append(StringUtil.ToHexString((int) Type)).Append("\n");
    buffer.Append(" .scenarioId = ").Append(StringUtil.ToHexString(ScenarioId)).Append("\n");
    buffer.Append("[/SCENARIOPROTECT]\n");
    return buffer.ToString();
}
}