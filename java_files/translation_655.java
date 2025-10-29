import java.util.*;

public class Translation655 {
    public static TermStats[] GetHighFreqTerms( IndexReader reader, int numTerms, String field, Comparator<TermStats> comparer ) throws IOException {
    TermStatsQueue tiq = null ;
    if ( field != null ) {
        Fields fields = MultiFields . getFields ( reader ) ;
        if ( fields == null ) {
            throw new IllegalArgumentException ( "field " + field + " not found" ) ;
        }
        Terms terms = fields . getTerms ( field ) ;
        if ( terms != null ) {
            TermsEnum termsEnum = terms . getIterator ( null ) ;
            tiq = new TermStatsQueue ( numTerms , comparer ) ;
            tiq . fill ( field , termsEnum ) ;
        }
    }
    else {
        Fields fields = MultiFields . getFields ( reader ) ;
        if ( fields == null ) {
            throw new IllegalArgumentException ( "no fields found for this index" ) ;
        }
        tiq = new TermStatsQueue ( numTerms , comparer ) ;
        for ( String fieldName : fields . fieldNames ( ) ) {
            Terms terms = fields . getTerms ( fieldName ) ;
            if ( terms != null ) {
                tiq . fill ( fieldName , terms . getIterator ( null ) ) ;
            }
        }
    }
    return tiq . toArray ( ) ;
}
}