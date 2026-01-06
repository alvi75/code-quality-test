import java.util.*;

public class Translation819 {
    1 public LimitTokenCountAnalyzer(Analyzer delegate, int maxTokenCount, boolean consumeAllTokens) {
    super(delegate.getStrategy());
    this.delegate = delegate;
    this.maxTokenCount = maxTokenCount;
    this.consumeAllTokens = consumeAllTokens;
}
}