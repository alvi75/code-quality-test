import java.util.*;

public class Translation257 {
    1 public CommonGramsQueryFilter create(TokenStream input) {
    final CommonGramsFilter commonGrams = super.create(input);
    return new CommonGramsQueryFilter(commonGrams);
}
}