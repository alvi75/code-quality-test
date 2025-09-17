import java.util.*;

public class Translationtranslation_819 {
    public LimitTokenCountAnalyzer(Analyzer delegate, int maxTokenCount, boolean consumeAllTokens) {
        super(delegate.getReuseStrategy());
        this.delegate = delegate;
        this.maxTokenCount = maxTokenCount;
        this.consumeAllTokens = consumeAllTokens;
    }
}