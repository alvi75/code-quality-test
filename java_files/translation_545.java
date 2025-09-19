import java.util.*;

public class Translation545 {
    public EdgeNGramTokenFilterFactory(Map<String,String> args, int minGramSize, int maxGramSize, boolean preserveOriginal) {
    super(args);
    this.minGramSize = minGramSize;
    this.maxGramSize = maxGramSize;
    this.preserveOriginal = preserveOriginal;
}
}