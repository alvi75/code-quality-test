import java.util.*;

public class Translation257 {
    public TokenStream create(TokenStream input) {
    TokenStream commonGrams = super.create(input);
    return new CommonGramsQueryFilter(commonGrams);
}
}