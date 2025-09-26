import java.util.*;

public class Translation710 {
    public BloomFilteringPostingsFormat(PostingsFormat delegatePostingsFormat,BloomFilterFactory bloomFilterFactory) {
    super();
    this.delegatePostingsFormat = delegatePostingsFormat;
    this.bloomFilterFactory = bloomFilterFactory;
}
}