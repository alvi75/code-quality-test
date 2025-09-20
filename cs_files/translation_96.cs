using System;
using System.Collections.Generic;

public class Translation96
{
    public override string ToString(){
    string symbol = "";
    if (m_startIndex >= 0 && m_startIndex < _input.LT(1)){
        symbol = _input.GetText(m_startIndex, m_endIndex - 1);
    }
    return "TokenMgrError(" + symbol + " not in use)";
}
}