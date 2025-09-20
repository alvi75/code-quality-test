using System;
using System.Collections.Generic;

public class Translation913
{
    public override string ToQueryString(IEscapeQuerySyntax escaper){
    if (IsDefaultField(this.m_field)){
        return this.m_text.ToString();
    }
    else{
        return this.m_field + ":" + this.m_text;
    }
}
}