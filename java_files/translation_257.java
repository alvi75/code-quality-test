import java.util.*;

public class Translation257 {
    public Query create(QueryNodeGramsQuery gramsQuery) {
    Set<String> commonWords = new HashSet<>();
    if (gramsQuery.getWordFiles() != null) {
        commonWords.addAll(gramsQuery.getWordFiles());
    }
    if (gramsQuery.getStopWordFiles() != null) {
        commonWords.addAll(gramsQuery.getStopWordFiles());
    }
    if (!commonWords.isEmpty()) {
        commonWords.add(" ");
    }
    return new CommonGramsQuery(gramsQuery.getBaseQuery(), commonWords);
}
}