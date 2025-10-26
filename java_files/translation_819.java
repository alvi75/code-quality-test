import java.util.*;

public class Translation819 {
    ublic LimitTokenCountAnalyzer(Analyzer delegate, int maxTokenCount, boolean consumeAllTokens) : base(delegate.getStrategy()){
    this.delegate = delegate;
    this.maxTokenCount = maxTokenCount;
    this.consumeAllTokens = consumeAllTokens;
}
}