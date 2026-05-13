import java.util.*;

public class Translation257 {
    1 public TokenStream create(TokenStream input) {
    2 final CommonGramsFilter commonGrams = (CommonGramsFilter) super.create(input);
    3 return new CommonGramsQueryFilter(commonGrams);
}
}