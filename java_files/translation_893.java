import java.util.*;

public class Translation893 {
    ublic override TokenStream Create(TokenStream input) {
    return new EnglishPossessiveFilter(LuceneVersion.LUCENE_30, input);
}
}