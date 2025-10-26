import java.util.*;

public class Translation824 {
    ublic override TokenStream Create(TokenStream input) {
    return new ReverseStringFilter(LuceneVersion.LUCENE_VERSION, input);
}
}