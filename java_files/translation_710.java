import java.util.*;

public class Translation710 {
    ublic BloomFilteringPostingsFormat( PostingsFormat delegatePostingsFormat , BloomFilterFactory bloomFilterFactory ) : base( ) {
    _delegatePostingsFormat = delegatePostingsFormat ;
    _bloomFilterFactory = bloomFilterFactory ;
}
}