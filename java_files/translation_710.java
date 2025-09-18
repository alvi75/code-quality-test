public BloomFilteringPostingsFormat( PostingsFormat delegatePostingsFormat, BloomFilterFactory bloomFilterFactory ){
    super( delegatePostingsFormat );
    this.bloomFilterFactory = bloomFilterFactory;
}