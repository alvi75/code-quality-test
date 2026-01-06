import java.util.*;

public class Translation710 {
    public BloomFilteringPostingsFormat(PostingsFormat delegatePostingsFormat,BloomFilterFactory bloomFilterFactory) {
    super(delegatePostingsFormat);
    this.delegatePostingsFormat = delegatePostingsFormat;
    this.bloomFilterFactory = bloomFilterFactory;
}
}