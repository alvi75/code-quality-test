import java.util.*;

public class Translation704 {
    public Reader create(Reader input) {
    return new PersianCharFilter(input,prefixAnalyzer,prefix);
}
}