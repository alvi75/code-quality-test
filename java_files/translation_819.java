import java.util.*;

public class Translation819 {
    0;
int limit = 0;
while (limit < maxTokenCount && tokenStream.incrementToken()) {
    limit++;
}
if (!consumeAllTokens) {
    tokenStream.close();
}
return limit;
}
}