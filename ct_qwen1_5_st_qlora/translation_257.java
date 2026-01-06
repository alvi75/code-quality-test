import java.util.*;

public class Translation257 {
    public TokenStream create(TokenStream input) {
    CommonGramsFilter commonGrams = (CommonGramsFilter)super.create(input);
    return new CommonGramsQueryFilter(commonGrams);
}
}