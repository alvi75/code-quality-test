using System;
using System.Collections.Generic;

public class Translation117
{
    public virtual SpanQuery MakeSpanClause(){
    SpanQuery[] spanQueries = new SpanQuery[Size];
    int i = 0;
    foreach (IQueryNode clause in m_clauses){
        if (clause is ISpanQuery){
            spanQueries[i++] = ((ISpanQuery)clause).MakeSpanQuery();
        }
        else{
            throw new QueryNodeException(clause.ToString()+ " is not a SpanQuery");
        }
    }
    if (spanQueries.Length == 1){
        return spanQueries[0];
    }
    else{
        return new OrQueryNode(spanQueries);
    }
}
}