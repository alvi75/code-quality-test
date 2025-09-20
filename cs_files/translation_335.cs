using System;
using System.Collections.Generic;

public class Translation335
{
    public override String ToString(){
    StringBuilder buffer = new StringBuilder();
    buffer.Append("[CFRULE]\n");
    buffer.Append(" .cfRuleType =").Append(StringUtil.ToHexString(CfRuleType)).Append("\n");
    buffer.Append(" .cfRuleState =").Append(StringUtil.ToHexString(CfRuleState)).Append("\n");
    buffer.Append(" .cfRuleFlags =").Append(StringUtil.ToHexString(CfRuleFlags)).Append("\n");
    buffer.Append(" .cfLimit =").Append(StringUtil.ToHexString(CfLimit)).Append("\n");
    buffer.Append(" .cfType =").Append(StringUtil.ToHexString(CfType)).Append("\n");
    buffer.Append(" .cfRuleNumber =").Append(StringUtil.ToHexString(CfRuleNumber)).Append("\n");
    buffer.Append(" .cfLastModifiedOn =").Append(StringUtil.ToHexString(CfLastModifiedOn)).Append("\n");
    buffer.Append("[/CFRULE]\n");
    return buffer.ToString();
}
}