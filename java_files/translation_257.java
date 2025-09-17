import java.util.*;

public class Translationtranslation_257 {
    public TokenStream create(TokenStream input) {
        final TokenStream commonGrams = super.create(input);
        return new CommonGramsQuery(cgf, commonGrams);
    }
}