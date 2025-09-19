import java.util.*;

public class Translation819 {
    public LimitTokenCountFilter(TokenStream delegate,int maxTokenCount,boolean consumeAllTokens) {
    super(delegate);
    if (maxTokenCount < 1) {
        throw new IllegalArgumentException("maxTokenCount must be greater than zero");
    }
    this.maxTokenCount = maxTokenCount;
    this.consumeAllTokens = consumeAllTokens;
}
}