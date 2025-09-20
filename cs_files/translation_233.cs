using System;
using System.Collections.Generic;

public class Translation233
{
    public override Search.Query Build(IQueryNode queryNode){
    var andNode = (ANDQueryNode)queryNode;
    BooleanQuery bQuery = new BooleanQuery();
    IList<IQueryNode> children = andNode.GetChildren();
    if (children != null){
        foreach (IQueryNode child in children){
            object obj = child.GetTag(QueryTreeBuilder.QUERY_TREE_BUILDER_TAGID);
            if (obj != null){
                Query query = (Query)obj;
                try{
                    bQuery.Add(query, GetModifierValue(child));
                }
                catch (BooleanQuery.TooManyClausesException ex){
                    throw new QueryNodeException(new Message(QueryParserMessages.TOO_MANY_BOOLEAN_CLAUSES, BooleanQuery.MaxClauseCount, queryNode.ToQueryString(new EscapeQuerySyntax())), ex);
                }
            }
        }
    }
    bQuery.MinimumNumberShouldMatch = andNode.MinimumMatchingElements;
    if (andNode.IsBoosted){
        bQuery.Boost = andNode.Boost;
    }
    return bQuery;
}
}