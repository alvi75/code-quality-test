using System;
using System.Collections.Generic;

public class Translation610
{
    public RuleTagToken(string ruleName, int bypassTokenType, string label){
    if (ruleName == null || ruleName.Length == 0){
        throw new ArgumentException("ruleName must not be null or empty");
    }
    this.ruleName = ruleName;
    this.bypassTokenType = bypassTokenType;
    this.label = label;
}
}