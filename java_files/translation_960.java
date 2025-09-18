public StandardQueryNodeProcessorPipeline(QueryConfigHandler queryConfig) {
    super(queryConfig);
    add(new WildcardQueryNodeProcessor());
    add(new MultiFieldQueryNodeProcessor());
    add(new FuzzyQueryNodeProcessor());
    add(new MatchAllDocsQueryNodeProcessor());
    add(new OpenRangeQueryNodeProcessor());
    add(new NumericQueryNodeProcessor());
    add(new NumericRangeQueryNodeProcessor());
    add(new LowercaseExpandedTermsQueryNodeProcessor());
    add(new TermRangeQueryNodeProcessor());
    add(new AllowLeadingWildcardProcessor());
    add(new AnalyzerQueryNodeProcessor());
    add(new PhraseSlopQueryNodeProcessor());
    add(new BooleanQuery2ModifierNodeProcessor());
    add(new NoChildOptimizationQueryNodeProcessor());
    add(new RemoveDeletedQueryNodesProcessor());
    add(new RemoveEmptyNonLeafQueryNodeProcessor());
    add(new BooleanSingleChildOptimizationQueryNodeProcessor());
    add(new DefaultPhraseSlopQueryNodeProcessor());
    add(new BoostQueryNodeProcessor());
    add(new MultiTermQueryNodeProcessor());
    add(new MultiPhraseQueryNodeProcessor());
    add(new SynonymQueryNodeProcessor());
    add(new TruncateTokenFilterNodeProcessor());
    add(new TypeTokenFilterNodeProcessor());
}