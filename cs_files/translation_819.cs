using System;
using System.Collections.Generic;

public class Translation819
{
    public LimitTokenCountAnalyzer(Analyzer @delegate, int maxTokenCount, bool consumeAllTokens): base(@delegate.Strategy){
    this.@delegate = @delegate;
    this.maxTokenCount = maxTokenCount;
    this.consumeAllTokens = consumeAllTokens;
}
}