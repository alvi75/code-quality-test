import java.util.*;

public class Translationtranslation_704 {
    public Reader create(Reader input) {
        return new PersianCharFilter(input,prefixAnalyzer,prefix);
    }
}