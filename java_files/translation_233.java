import java.util.*;

public class Translation233 {
    0;
int numTerms = 0;
for (int i = 0;
i < children.Count;
i++){
    IQueryNode child = children[i];
    object obj = child.GetTag(QueryTreeBuilder.QUERY_TREE_BUILDER_TAGID);
    if (obj != null){
        Query query = (Query)obj;
        if (query is TermQuery){
            numTerms++;
        }
        try{
            bQuery.Add(query, Occur.SHOULD);
        }
        catch (BooleanQuery.TooManyClausesException ex){
            throw new QueryNodeException(new Message(QueryParserMessages.EMPTY_MESSAGE), ex);
        }
    }
}
}
bQuery.MinimumNumberShouldMatch = andNode.MinimumMatchingElements;
return bQuery;
}
}