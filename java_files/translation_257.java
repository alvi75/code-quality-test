import java.util.*;

public class Translation257 {
    public CommonGramsQueryFilter create(TokenStream input) {
    CommonGramsFilter commonGrams = (CommonGramsFilter) base.create(input);
    return new CommonGramsQueryFilter(commonGrams);
}
}