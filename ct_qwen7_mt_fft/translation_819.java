import java.util.*;

public class Translation819 {
    public LimitTokenCountAnalyzer(Analyzer delegate,int maxTokenCount, boolean consumeAllTokens) {
    super(delegate.getReuseStrategy());
    this.delegate = delegate;
    if (maxTokenCount < 1) {
        throw new IllegalArgumentException("maxTokenCount should be positive number.");
    }
    this.maxTokenCount = maxTokenCount;
    this.consumeAllTokens = consumeAllTokens;
}
}