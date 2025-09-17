import java.util.*;

public class Translationtranslation_262 {
    public TokenStream create(TokenStream input) {
        return new ElisionFilter(input, articles);
    }
}