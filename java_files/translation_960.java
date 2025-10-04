import java.util.*;

public class Translation960 {
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
    add(new BoostQueryNodeProcessor());
    add(new MultiTermRewriteMethodProcessor());
}
}