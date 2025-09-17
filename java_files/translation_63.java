import java.util.*;

public class Translationtranslation_63 {
    public TokenStream create(TokenStream input) {
        return new DoubleMetaphoneFilter(input, maxCodeLength, inject);
    }
}