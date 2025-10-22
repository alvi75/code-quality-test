import java.util.*;

public class Translation257 {
    public CommonGramsQueryFilter create(TokenStream input) {
    final CommonGramsFilter commonGrams = (CommonGramsFilter)super.create(input);
    return new CommonGramsQueryFilter(commonGrams);
}
}