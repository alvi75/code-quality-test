ublic StandardQueryNodeProcessorPipeline(QueryConfigHandler queryConfig) : base(queryConfig){
    Add(new WildcardQueryNodeProcessor());
    Add(new MultiFieldQueryNodeProcessor());
    Add(new FuzzyQueryNodeProcessor());
    Add(new MatchAllDocsQueryNodeProcessor());
    Add(new OpenRangeQueryNodeProcessor());
    Add(new NumericQueryNodeProcessor());
    Add(new NumericRangeQueryNodeProcessor());
    Add(new LowercaseExpandedTermsQueryNodeProcessor());
    Add(new TermRangeQueryNodeProcessor());
    Add(new AllowLeadingWildcardProcessor());
    Add(new AnalyzerQueryNodeProcessor());
    Add(new PhraseSlopQueryNodeProcessor());
    Add(new BooleanQuery2ModifierNodeProcessor());
    Add(new NoChildOptimizationQueryNodeProcessor());
    Add(new RemoveDeletedQueryNodesProcessor());
    Add(new RemoveEmptyNonLeafQueryNodeProcessor());
    Add(new BooleanSingleChildOptimizationQueryNodeProcessor());
    Add(new DefaultPhraseSlopQueryNodeProcessor());
    Add(new BoostQueryNodeProcessor());
    Add(new MultiTermRewriteMethodProcessor());
}