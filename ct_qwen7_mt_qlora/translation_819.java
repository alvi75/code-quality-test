import java.util.*;

public class Translation819 {
    1 public LimitTokenCountAnalyzer(Analyzer delegate, int maxTokenCount, boolean consumeAllTokens) {
    2 super(delegate.getReuseStrategy());
    3 this.delegate = delegate;
    4 this.maxTokenCount = maxTokenCount;
    5 this.consumeAllTokens = consumeAllTokens;
}
}