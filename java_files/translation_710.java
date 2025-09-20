import java.util.*;

public class Translation710 {
    public BloomFilteringPostingsFormat( PostingsFormat delegatePostingsFormat ,BloomFilterFactory bloomFilterFactory ) {
    super();
    this._delegatePostingsFormat = delegatePostingsFormat;
    this._bloomFilterFactory = bloomFilterFactory;
}
}