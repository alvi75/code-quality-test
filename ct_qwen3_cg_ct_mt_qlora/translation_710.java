import java.util.*;

public class Translation710 {
    public BloomFilteringPostingsFormat(PostingsFormat delegatePostingsFormat,BloomFilterFactory bloomFilterFactory){
    this.delegatePostingsFormat = delegatePostingsFormat;
    bloomFilterFactory = bloomFilterFactory;
}
}