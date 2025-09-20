using System;
using System.Collections.Generic;

public class Translation960
{
    public StandardQueryNodeProcessorPipeline(QueryConfigHandler queryConfig): base(queryConfig){
    Add(new WildcardQueryNodeProcessor());
    Add(new MultiFieldQueryNodeProcessor());
    Add(new FuzzyQueryNodeProcessor());
    Add(new RegexpQueryNodeProcessor());
    Add(new MatchAllDocsQueryNodeProcessor());
    Add(new OpenRangeQueryNodeProcessor());
    Add(new PointQueryNodeProcessor());
    Add(new PointRangeQueryNodeProcessor());
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
    Add(new MultiTermQueryNodeProcessor());
    Add(new FieldQueryNodeProcessor());
    Add(new DistanceQueryNodeProcessor());
    Add(new SpanNotQueryNodeProcessor());
    Add(new SpanOrQueryNodeProcessor());
    Add(new SpanWithinQueryNodeProcessor());
    Add(new SpanFirstQueryNodeProcessor());
    Add(new SpanLastQueryNodeProcessor());
    Add(new SpanQueryNodeProcessor());
    Add(new GroupQueryNodeProcessor());
    Add(new HCenterQueryNodeProcessor());
    Add(new QueryTreeBuilder());
}
}