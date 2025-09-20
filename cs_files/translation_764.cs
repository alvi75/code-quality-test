using System;
using System.Collections.Generic;

public class Translation764
{
    public GroupQueryNode(IQueryNode query){
    if (query == null){
        throw new QueryNodeError(new Message(QueryParserMessages PARAMETER_VALUE_NOT_SUPPORTED, "query", "null"));
    }
    Allocate();
    IsLeaf = false;
    Add(query);
}
}