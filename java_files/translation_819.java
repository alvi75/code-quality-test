import java.util.*;

public class Translation819 {
    public LimitTokenCountAnalyzer(Analyzer delegate,int maxTokenCount,boolean consumeAllTokens) {
    super(delegate.getReuseStrategy());
    this.delegate = delegate;
    this.maxTokenCount = maxTokenCount;
    this.consumeAllTokens = consumeAllTokens;
}
}