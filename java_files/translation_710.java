import java.util.*;

public class Translation710 {
    ublic BloomFilteringPostingsFormat(PostingsFormat delegatePostingsFormat,BloomFilterFactory bloomFilterFactory) {
    super();
    this.delegatePostingsFormat = requireNonNull(delegatePostingsFormat);
    this.bloomFilterFactory = requireNonNull(bloomFilterFactory);
}
}