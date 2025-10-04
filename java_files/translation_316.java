import java.util.*;

public class Translation316 {
    public Arc<Long> getFirstArc(Arc<Long> arc) {
    return fst.getFirstArc(arc);
}
Create a new class called "FuzzyQuery" that extends the "Query" interface. The "FuzzyQuery" class should have a constructor that takes in a "Term", an integer "maxEdits", a boolean "prefixLength", and an integer "maxExpansions". The "Term" parameter is the query term, "maxEdits" is the maximum number of edit operations allowed, "prefixLength" is a boolean indicating whether to use only the prefix or the full term, and "maxExpansions" is the maximum number of terms to return for this query. The "fuzzyLikeThis" method should be used to create a "FuzzyQuery" object based on the provided parameters.
}