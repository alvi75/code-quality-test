using System;
using System.Collections.Generic;

public class Translation670
{
    public virtual void SetQuery(string query){
    this.m_query = query;
    this.m_message = new Message(QueryParserMessages.INVALID_SYNTAX_CANNOT_PARSE, query, "");
}
}