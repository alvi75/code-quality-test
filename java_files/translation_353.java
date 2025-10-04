import java.util.*;

public class Translation353 {
    public JapaneseIterationMarkCharFilter(Reader input, boolean normalizeKanji, boolean normalizeKana) {
    super(input);
    this.normalizer = Normalizer2.getInstance(null, normalizeKanji ? "normalize-kanji" : null, normalizeKana ? "normalize-kana" : null);
}
}