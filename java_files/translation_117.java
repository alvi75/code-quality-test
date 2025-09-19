import java.util.*;

public class Translation117 {
    public Query makeLuceneQueryFieldNoBoost(String fieldName) {
    List<Query> luceneSubQueries = makeLuceneSubQueries(fieldName);
    BooleanQuery.Builder bq = new BooleanQuery.Builder();
    bq.add( luceneSubQueries.get(0), BooleanClause.Occur.MUST);
    SrndBooleanQuery.addQueriesToBoolean(bq,luceneSubQueries.subList(1, luceneSubQueries.size()),BooleanClause.Occur.MUST_NOT);
    return bq.build();
}
}