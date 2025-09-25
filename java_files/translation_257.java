import java.util.*;

public class Translation257 {
    public TokenStream create(TokenStream input) {
    final CommonGramsFilter commonGrams = (CommonGramsFilter) super.create(input);
    return new CommonGramsQueryFilter(commonGrams);
}
}