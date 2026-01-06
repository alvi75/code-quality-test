import java.util.*;

public class Translation819 {
    public LimitTokenCountAnalyzer(TokenStream input, int maxTokenCount, boolean consumeAllTokens) {
    super(input);
    if (maxTokenCount < 1) {
        throw new IllegalArgumentException("maxTokenCount must be greater than zero");
    }
    this.maxTokenCount = maxTokenCount;
    this.consumeAllTokens = consumeAllTokens;
}
}