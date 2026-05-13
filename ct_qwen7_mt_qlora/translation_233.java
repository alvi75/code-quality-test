import java.util.*;

public class Translation233 {
    1 public Query build( IQueryNode queryNode ) throws QueryNodeException {
    2 AnyQueryNode andNode = ( AnyQueryNode ) queryNode ;
    3 BooleanQuery bQuery = new BooleanQuery() ;
    4 List< IQueryNode > children = andNode . getChildren ( ) ;
    5 if ( children != null ) {
        6 for ( IQueryNode child : children ) {
            7 Object obj = child . getTag ( QueryTreeBuilder . QUERY_TREE_BUILDER_TAGID ) ;
            8 if ( obj != null ) {
                9 Query query = ( Query ) obj ;
                10 try {
                    11 bQuery . add ( query , Occur . SHOULD ) ;
                    12 }
                    catch ( BooleanQuery . TooManyClausesException e ) {
                        13 throw new QueryNodeException ( new Message ( QueryParserMessages . EMPTY_MESSAGE ) , e ) ;
                        14 }
                        15 }
                        16 }
                        17 }
                        18 bQuery . minimumNumberShouldMatch = andNode . getMinimumMatchingElements ( ) ;
                        19 return bQuery ;
                    }
}