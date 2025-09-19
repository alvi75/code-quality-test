import java.util.*;

public class Translation393 {
    public BlendedTermQuery build() {
    return new BlendedTermQuery(ArrayUtil.copyOfSubArray(terms, 0, numTerms),ArrayUtil.copyOfSubArray(boosts, 0, numTerms),ArrayUtil.copyOfSubArray(contexts, 0, numTerms),rewriteMethodNumSegments);
}
}