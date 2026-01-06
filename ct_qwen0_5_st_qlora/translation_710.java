import java.util.*;

public class Translation710 {
    public BloomFilteringPostingsFormat(PostingsFormat delegatePostingsFormat,BloomFilterFactory bloomFilterFactory) {
    super(delegatePostingsFormat);
    _bloomFilterFactory = bloomFilterFactory;
}
}