import java.util.*;

public class Translationtranslation_710 {
    public BloomFilteringPostingsFormat(PostingsFormat delegatePostingsFormat,BloomFilterFactory bloomFilterFactory) {
        super(delegatePostingsFormat);
        this.bloomFilterFactory = bloomFilterFactory;
    }
}