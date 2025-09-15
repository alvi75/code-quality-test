import java.util.*;

public class Translationtranslation_257 {
    public TokenStream create(TokenStream input) {
        final CommonGramsFilter commonGrams = new CommonGramsFilter(input, commonWords);
        return commonGrams;
    }
}