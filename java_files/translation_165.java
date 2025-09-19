import java.util.*;

public class Translation165 {
    public BrazilianStemFilterStemmerOverrideMap(FST<BytesRef> stemmerOverrideSet) {
    super(EnglishAnalyzerStemFilter.ENGLISH_STEMMER_IGNORE_CASE);
    this.stemmerOverrideSet = stemmerOverrideSet;
}
}