import java.util.*;

public class Translationtranslation_780 {
    public void setMaxShingleSize(int maxShingleSize) {
        if (maxShingleSize < 2) {
            throw new IllegalArgumentException("Max shingle size must be >= 2");
        }
        this.maxShingleSize = maxShingleSize;
    }
    ShingleFilterFactory.this.setOutputUnigrams(outputUnigrams);
    ShingleFilterFactory.this.setOutputUnigramsIfNoShingles(outputUnigramsIfNoShingles);
    ShingleFilterFactory.this.setTokenSeparator(tokenSeparator);
    ShingleFilterFactory.this.setFillerToken(fillerToken);
    }
}