import java.util.*;

public class Translation353 {
    public JapaneseIterationMarkCharFilter(Reader input, boolean normalizeKanji, boolean normalizeKana) {
    super(input);
    this.normalizeKanji = normalizeKanji;
    this.normalizeKana = normalizeKana;
    buffer.reset(input);
}
}