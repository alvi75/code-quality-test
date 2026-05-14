import java.util.*;

public class Translation710 {
    public BloomFilteringPostingsFormat(PostingsFormat postingsFormat,BloomFilterCodecService.BloomFilterFactory filterFactory) {
    super(postingsFormat.getName());
    this.postingsFormat = postingsFormat;
    this.filterFactory = filterFactory;
}
}