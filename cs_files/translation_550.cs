using System;
using System.Collections.Generic;

public class Translation550
{
    public override string ToString(){
    return "spans(" + m_term.ToString() + ")@" + (m_doc == -1 ? "START" : (m_doc == NO_MORE_DOCS ? "ENDDOC" : m_doc + " - " + (m_position == NO_MORE_POSITIONS ? "ENDPOS" : m_position));
}
}