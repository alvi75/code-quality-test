using System;
using System.Collections.Generic;

public class Translation731
{
    public static WeightedTerm[] GetTerms(Query query, bool prohibited, string fieldName){
    var terms = new List<WeightedTerm>();
    var fieldQuery = new FieldQuery(query, prohibited, fieldName);
    var matcher = new MatchAllDocsQueryBuilder();
    matcher.SetQuery(fieldQuery);
    var weightedTerms = matcher.FindAll();
    foreach (var t in weightedTerms){
        terms.Add(t);
    }
    return terms.ToArray();
}
}